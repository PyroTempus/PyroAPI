package me.PyroAPI.Events.PyroWeatherPro;

import org.bukkit.World;

import me.PyroAPI.Events.PyroBaseEvent;

/**
 * Event called when a custom PyroWeatherPro storm ends in a world.
 *
 * <p>This event is fired after all storm-related logic has finished,
 * including particle effects, scheduled tasks, and gameplay effects.</p>
 *
 * <p>Example usage:
 * <pre>{@code
 * @EventHandler
 * public void onWeatherEnd(PyroWeatherEndEvent event) {
 *     if(event.getStormId().equals("VoidStorm")) {
 *         event.getWorld().strikeLightningEffect(
 *             event.getWorld().getSpawnLocation()
 *         );
 *     }
 * }
 * }</pre>
 */
public class PyroWeatherEndEvent extends PyroBaseEvent {

    private final String stormId;
    private final World world;

    /**
     * Constructs a new PyroWeatherEndEvent.
     *
     * @param stormId The internal identifier of the storm that ended.
     * @param world   The world in which the storm was active.
     */
    public PyroWeatherEndEvent(String stormId, World world) {
        this.stormId = stormId;
        this.world = world;
    }

    /**
     * Gets the internal ID of the storm that ended.
     *
     * @return the storm ID.
     */
    public String getStormId() {
        return stormId;
    }

    /**
     * Gets the world in which the storm ended.
     *
     * @return the affected world.
     */
    public World getWorld() {
        return world;
    }

}
