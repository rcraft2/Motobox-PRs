package motobox.screen;

import motobox.networking.ModMessages;
import motobox.util.IEntityDataSaver;
import motobox.util.network.DailyObjectiveC2SPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlackjackScreen extends HandledScreen<BlackjackScreenHandler> {
    private static final int BET_SMALL = 5;
    private static final int BET_MEDIUM = 25;
    private static final int BET_LARGE = 100;
    private static final int BET_MAX = 5000;
    private static final int CARD_WIDTH = 32;
    private static final int CARD_HEIGHT = 44;
    private static final int CARD_GAP = 6;
    private static final int MAX_CARDS_PER_ROW = 4;
    
    private static final int SCREEN_WIDTH = 320;
    private static final int SCREEN_HEIGHT = 220;
    private static final int LEFT_PANEL_WIDTH = 54;
    private static final int CENTER_WIDTH = 212;
    private static final int RIGHT_PANEL_WIDTH = 54;

    private final Random random = new Random();

    private ButtonWidget betSmallButton;
    private ButtonWidget betMediumButton;
    private ButtonWidget betLargeButton;
    private ButtonWidget betMaxButton;
    private ButtonWidget dealButton;
    private ButtonWidget hitButton;
    private ButtonWidget standButton;

    private final List<Card> playerCards = new ArrayList<>();
    private final List<Card> dealerCards = new ArrayList<>();

    private int pot = 0;
    private boolean roundActive = false;
    private String status = "Place a bet to start.";

    public BlackjackScreen(BlackjackScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        this.backgroundWidth = SCREEN_WIDTH;
        this.backgroundHeight = SCREEN_HEIGHT;
        this.titleX = 1000;
        this.titleY = 1000;
        this.playerInventoryTitleY = 1000;
    }

    @Override
    protected void init() {
        super.init();

        // Left panel buttons - stacked vertically
        int bx = this.x + 4;
        int by = this.y + 8;
        int btnWidth = 46;
        int btnHeight = 16;

        this.betSmallButton = this.addDrawableChild(ButtonWidget.builder(Text.literal("$5"), b -> placeBet(BET_SMALL))
                .dimensions(bx, by, btnWidth, btnHeight)
                .build());
        this.betMediumButton = this.addDrawableChild(ButtonWidget.builder(Text.literal("$25"), b -> placeBet(BET_MEDIUM))
                .dimensions(bx, by + 18, btnWidth, btnHeight)
                .build());
        this.betLargeButton = this.addDrawableChild(ButtonWidget.builder(Text.literal("$100"), b -> placeBet(BET_LARGE))
                .dimensions(bx, by + 36, btnWidth, btnHeight)
                .build());
        this.betMaxButton = this.addDrawableChild(ButtonWidget.builder(Text.literal("$5K"), b -> placeMaxBet())
                .dimensions(bx, by + 54, btnWidth, btnHeight)
                .build());

        this.dealButton = this.addDrawableChild(ButtonWidget.builder(Text.literal("Deal"), b -> startRound())
                .dimensions(bx, by + 76, btnWidth, btnHeight)
                .build());
        this.hitButton = this.addDrawableChild(ButtonWidget.builder(Text.literal("Hit"), b -> hit())
                .dimensions(bx, by + 94, btnWidth, btnHeight)
                .build());
        this.standButton = this.addDrawableChild(ButtonWidget.builder(Text.literal("Stand"), b -> stand())
                .dimensions(bx, by + 112, btnWidth, btnHeight)
                .build());

        updateButtons();
    }

    private void placeBet(int amount) {
        if (roundActive) {
            return;
        }
        if (pot >= BET_MAX) {
            status = "Max total bet is $" + BET_MAX + ".";
            return;
        }
        if (pot + amount > BET_MAX) {
            status = "Cannot exceed total bet of $" + BET_MAX + ".";
            return;
        }
        if (getMoney() < amount) {
            status = "Not enough money.";
            return;
        }

        pot += amount;
        sendMoney(-amount);
        status = "Bet placed: $" + pot;
        updateButtons();
    }

    private void placeMaxBet() {
        if (roundActive) {
            return;
        }
        if (pot >= BET_MAX) {
            status = "Max total bet is $" + BET_MAX + ".";
            return;
        }

        int remainingToCap = BET_MAX - pot;
        int affordable = (int) Math.floor(getMoney());
        int amount = Math.min(remainingToCap, affordable);

        if (amount <= 0) {
            status = "Not enough money.";
            return;
        }

        pot += amount;
        sendMoney(-amount);
        status = "Bet placed: $" + pot;
        updateButtons();
    }

    private void startRound() {
        if (roundActive || pot <= 0) {
            status = "Place a bet first.";
            return;
        }

        playerCards.clear();
        dealerCards.clear();

        playerCards.add(drawCard());
        playerCards.add(drawCard());
        dealerCards.add(drawCard());
        dealerCards.add(drawCard());

        roundActive = true;
        status = "Round started. Hit or Stand.";

        if (handValue(playerCards) == 21) {
            finishRound();
        }

        updateButtons();
    }

    private void hit() {
        if (!roundActive) {
            return;
        }

        playerCards.add(drawCard());
        if (handValue(playerCards) > 21) {
            finishRound();
        }
    }

    private void stand() {
        if (!roundActive) {
            return;
        }

        while (handValue(dealerCards) < 17) {
            dealerCards.add(drawCard());
        }
        finishRound();
    }

    private void finishRound() {
        roundActive = false;

        int playerValue = handValue(playerCards);
        int dealerValue = handValue(dealerCards);
        boolean playerBlackjack = playerValue == 21 && playerCards.size() == 2;

        int payout = 0;
        if (playerValue > 21) {
            status = "Bust. You lose.";
        } else if (dealerValue > 21) {
            payout = pot * 2;
            status = "Dealer busts. You win $" + payout + ".";
        } else if (playerBlackjack && dealerValue != 21) {
            payout = (pot * 5) / 2;
            status = "Blackjack! You win $" + payout + ".";
        } else if (playerValue > dealerValue) {
            payout = pot * 2;
            status = "You win $" + payout + ".";
        } else if (playerValue == dealerValue) {
            payout = pot;
            status = "Push. Bet returned.";
        } else {
            status = "Dealer wins.";
        }

        if (payout > 0) {
            sendMoney(payout);
        }

        if (payout > pot) {
            sendDailyObjective(DailyObjectiveC2SPacket.BLACKJACK_WIN);
        }

        pot = 0;
        updateButtons();
    }

    private Card drawCard() {
        return new Card(random.nextInt(13) + 1, random.nextInt(4));
    }

    private int handValue(List<Card> cards) {
        int value = 0;
        int aces = 0;

        for (Card card : cards) {
            if (card.rank == 1) {
                aces++;
                value += 11;
            } else if (card.rank >= 10) {
                value += 10;
            } else {
                value += card.rank;
            }
        }

        while (value > 21 && aces > 0) {
            value -= 10;
            aces--;
        }

        return value;
    }

    private String cardRankName(int rank) {
        return switch (rank) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> Integer.toString(rank);
        };
    }

    private String suitName(int suit) {
        return switch (suit) {
            case 0 -> "♥";
            case 1 -> "♦";
            case 2 -> "♣";
            default -> "♠";
        };
    }

    private int suitColor(int suit) {
        if (suit == 0 || suit == 1) {
            return 0xD63031;
        }
        return 0x222222;
    }

    private void drawHand(DrawContext context, List<Card> cards, int startX, int startY, boolean hideSecondCard) {
        if (cards.isEmpty()) {
            context.drawText(this.textRenderer, "No cards", startX, startY + 18, 0xD5D5D5, false);
            return;
        }

        for (int i = 0; i < cards.size(); i++) {
            int row = i / MAX_CARDS_PER_ROW;
            int col = i % MAX_CARDS_PER_ROW;
            int cardX = startX + (CARD_WIDTH + CARD_GAP) * col;
            int cardY = startY + (CARD_HEIGHT + CARD_GAP) * row;

            if (hideSecondCard && i == 1) {
                context.fill(cardX, cardY, cardX + CARD_WIDTH, cardY + CARD_HEIGHT, 0xFF0F3A9A);
                context.drawBorder(cardX, cardY, CARD_WIDTH, CARD_HEIGHT, 0xFF9BB0E8);
                context.drawText(this.textRenderer, "?", cardX + 12, cardY + 18, 0xFFFFFF, false);
                continue;
            }

            Card card = cards.get(i);
            String rankText = cardRankName(card.rank);
            String suitText = suitName(card.suit);
            int textColor = suitColor(card.suit);

            context.fill(cardX, cardY, cardX + CARD_WIDTH, cardY + CARD_HEIGHT, 0xFFF8F8F8);
            context.drawBorder(cardX, cardY, CARD_WIDTH, CARD_HEIGHT, 0xFF202020);
            context.drawText(this.textRenderer, rankText, cardX + 4, cardY + 4, textColor, false);
            context.drawText(this.textRenderer, suitText, cardX + 4, cardY + 24, textColor, false);
        }
    }

    private void updateButtons() {
        if (betSmallButton == null) {
            return;
        }

        boolean canBet = !roundActive;
        this.betSmallButton.active = canBet;
        this.betMediumButton.active = canBet;
        this.betLargeButton.active = canBet;
        this.betMaxButton.active = canBet;
        this.dealButton.active = !roundActive && pot > 0;
        this.hitButton.active = roundActive;
        this.standButton.active = roundActive;
    }

    private double getMoney() {
        if (this.client == null || this.client.player == null) {
            return 0;
        }
        return ((IEntityDataSaver) this.client.player).getPersistentData().getDouble("money");
    }

    private void sendMoney(double amount) {
        var buf = PacketByteBufs.create();
        buf.writeDouble(amount);
        ClientPlayNetworking.send(ModMessages.MONEY_ID, buf);
    }

    private void sendDailyObjective(String objective) {
        var buf = PacketByteBufs.create();
        buf.writeString(objective);
        ClientPlayNetworking.send(ModMessages.DAILY_OBJECTIVE_ID, buf);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        this.renderBackground(context);

        // Left panel - dark background
        context.fill(this.x, this.y, this.x + LEFT_PANEL_WIDTH, this.y + SCREEN_HEIGHT, 0xFF1A1A1A);
        
        // Center panel - green card area
        int centerX = this.x + LEFT_PANEL_WIDTH;
        context.fill(centerX, this.y, centerX + CENTER_WIDTH, this.y + SCREEN_HEIGHT, 0xFF085E00);
        
        // Right panel - dark background
        int rightX = this.x + LEFT_PANEL_WIDTH + CENTER_WIDTH;
        context.fill(rightX, this.y, rightX + RIGHT_PANEL_WIDTH, this.y + SCREEN_HEIGHT, 0xFF1A1A1A);

        // Draw cards in center green area
        boolean hideDealerHoleCard = roundActive && dealerCards.size() > 1;
        String dealerValueText = hideDealerHoleCard ? "?" : Integer.toString(handValue(dealerCards));
        String playerValueText = Integer.toString(handValue(playerCards));

        int dealerLabelY = this.y + 8;
        int dealerCardsY = dealerLabelY + 12;
        int playerLabelY = this.y + 110;
        int playerCardsY = playerLabelY + 12;

        context.drawText(this.textRenderer, "Dealer [" + dealerValueText + "]", centerX + 4, dealerLabelY, 0xFFFFFF, false);
        drawHand(context, dealerCards, centerX + 4, dealerCardsY, hideDealerHoleCard);

        context.drawText(this.textRenderer, "Player [" + playerValueText + "]", centerX + 4, playerLabelY, 0xFFFFFF, false);
        drawHand(context, playerCards, centerX + 4, playerCardsY, false);

        // Draw info in right panel
        int infox = rightX + 4;
        int infoY = this.y + 8;
        context.drawText(this.textRenderer, "Pot:", infox, infoY, 0xE7D37C, false);
        context.drawText(this.textRenderer, "$" + pot, infox, infoY + 10, 0xE7D37C, false);
        context.drawText(this.textRenderer, "Money:", infox, infoY + 28, 0xA6E3A1, false);
        context.drawText(this.textRenderer, "$" + (int) getMoney(), infox, infoY + 38, 0xA6E3A1, false);
        context.drawText(this.textRenderer, "Status:", infox, infoY + 58, 0xDADADA, false);
        
        // Draw status text wrapped
        String[] statusLines = status.split(" ");
        String line1 = "";
        String line2 = "";
        for (String word : statusLines) {
            if ((line1 + word).length() <= 8) {
                line1 = (line1.isEmpty() ? word : line1 + " " + word);
            } else {
                line2 = (line2.isEmpty() ? word : line2 + " " + word);
            }
        }
        context.drawText(this.textRenderer, line1, infox, infoY + 68, 0xDADADA, false);
        if (!line2.isEmpty()) {
            context.drawText(this.textRenderer, line2, infox, infoY + 76, 0xDADADA, false);
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        this.drawMouseoverTooltip(context, mouseX, mouseY);
    }

    private static class Card {
        private final int rank;
        private final int suit;

        private Card(int rank, int suit) {
            this.rank = rank;
            this.suit = suit;
        }
    }
}
