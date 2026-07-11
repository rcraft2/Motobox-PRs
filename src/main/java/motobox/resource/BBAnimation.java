package motobox.resource;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;

import immersive_aircraft.resources.bbmodel.BBAnimator;
import org.joml.Vector3f;

public class BBAnimation extends immersive_aircraft.resources.bbmodel.BBAnimation {
    public final String uuid;
    public final String name;
    public final String loop;
    public final float length;
    public final int snapping;
    public final Map<String, BBAnimator> animators = new HashMap();
    public final int frameCount;

    public BBAnimation(JsonObject element) {
        super(element);
        this.uuid = element.getAsJsonPrimitive("uuid").getAsString();
        this.name = element.getAsJsonPrimitive("name").getAsString();
        this.loop = element.getAsJsonPrimitive("loop").getAsString();
        this.length = element.getAsJsonPrimitive("length").getAsFloat();
        this.snapping = element.getAsJsonPrimitive("snapping").getAsInt();
        this.frameCount = Math.max(1, (int)((double)(this.length * (float)this.snapping) + 0.5));
        if (element.has("animators")) {
            element.getAsJsonObject("animators").entrySet().forEach((entry) -> {
                BBAnimator animator = new BBAnimator(((JsonElement)entry.getValue()).getAsJsonObject(), this);
                String boneName = name; // assuming BBAnimator has a `name` field
                this.animators.put(boneName, animator);
            });
        }

    }

    public boolean hasAnimator(String uuid) {
        return this.animators.containsKey(uuid);
    }

    public Vector3f sample(String uuid, BBAnimator.Channel channel, float time) {
        if ("HOLD".equals(this.loop) && time >= this.length) {
            // Return the last frame's value
            return ((BBAnimator)this.animators.get(uuid)).sample(this, channel, this.length);
        }
        return ((BBAnimator)this.animators.get(uuid)).sample(this, channel, time);
    }

    public int toFrameIndex(float length) {
        int frameIndex = (int)((double)(length * (float)this.snapping) + 0.5);
        return Math.floorMod(frameIndex, this.frameCount);
    }
}
