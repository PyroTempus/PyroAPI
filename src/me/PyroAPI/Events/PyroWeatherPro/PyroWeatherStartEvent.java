package me.PyroAPI.Events.PyroWeatherPro;

import org.bukkit.World;

import me.PyroAPI.Events.PyroBaseEvent;

/**
 * Event called when a custom PyroWeatherPro storm is about to begin.
 *
 * <p>This event is fired when a storm has been selected and scheduled,
 * but before its effects are fully applied.</p>
 *
 * <p>Example usage:
 * <pre>{@code
 * @EventHandler
 * public void onWeatherStart(PyroWeatherStartEvent event) {
 *     if(event.getStormId().equals("AuroraStorm")) {
 *         event.getWorld().setTime(18000);
 *     }
 * }
 * }</pre>
 */
public class PyroWeatherStartEvent extends PyroBaseEvent {

    private final String stormId;
    private final World world;
    private final int duration;
    private final int warningTime;

    /**
     * Constructs a new PyroWeatherStartEvent.
     *
     * @param stormId     The internal identifier of the storm that is starting.
     * @param world       The world in which the storm will occur.
     * @param duration    The total duration of the storm (in ticks).
     * @param warningTime The time before the storm begins that warnings are sent (in ticks).
     */
    public PyroWeatherStartEvent(String stormId, World world, int duration, int warningTime) {
        this.stormId = stormId;
        this.world = world;
        this.duration = duration;
        this.warningTime = warningTime;
    }

    /**
     * Gets the internal ID of the storm that is starting.
     *
     * @return the storm ID.
     */
    public String getStormId() {
        return stormId;
    }

    /**
     * Gets the world in which the storm will occur.
     *
     * @return the target world.
     */
    public World getWorld() {
        return world;
    }

    /**
     * Gets the total duration of the storm.
     *
     * @return the storm duration in ticks.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Gets the warning lead time before the storm begins.
     *
     * @return the warning time in ticks.
     */
    public int getWarningTime() {
        return warningTime;
    }

}
