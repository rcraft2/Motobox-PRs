package minecrafttransportsimulator.jsondefs;

import java.util.LinkedHashMap;
import java.util.Map;

public class JSONConfigVehiclePrices {
    public static final String DEFAULT_VARIANT_KEY = "default";

    public String comment1 = "Vehicle purchase prices keyed by pack ID, then vehicle systemName, then variant key.";
    public String comment2 = "Set variants.default to apply one price to all colors/variants of that vehicle type.";
    public String comment3 = "Specific variant keys only need values when you want to override the default price.";
    public String comment4 = "displayName and variantDisplayNames are informational only and help identify entries while editing.";
    public String comment5 = "Set stolenVehicleSpawnEnabled=true to include this vehicle type in random stolen-car spawns.";
    public String comment6 = "stolenVehicleSalePrice controls the payout when delivered to the configured sale point.";
    public Map<String, Map<String, VehiclePriceEntry>> prices = new LinkedHashMap<>();

    public static class VehiclePriceEntry {
        public String displayName;
        public Map<String, String> variantDisplayNames = new LinkedHashMap<>();
        public Map<String, Double> variants = new LinkedHashMap<>();
        public boolean stolenVehicleSpawnEnabled;
        public double stolenVehicleSalePrice;
    }
}
