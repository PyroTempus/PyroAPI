package me.PyroAPI.Events.PyroFishingPro;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.inventory.ItemStack;

import me.PyroAPI.Events.PyroBaseEvent;

/**
 * Called when a player successfully catches a custom fish using the PyroFishingPro system.
 * <p>
 * This event is fired **before** the fish is given to the player. It is cancellable,
 * meaning you can prevent the fish from being caught entirely (e.g., for restrictions, conditions, etc.).
 * </p>
 * 
 * <p>
 * Example usage:
 * <pre>{@code
 * @EventHandler
 * public void onFishCatch(PyroFishCatchEvent event) {
 *     if (event.getTier().equals("Mythical")) {
 *         event.setCancelled(true); // block catching mythical fish
 *     }
 * }
 * }</pre>
 */
public class PyroFishCatchEvent extends PyroBaseEvent implements Cancellable {

    private final String tierId;
    private final String fishId;
    private final boolean hotspot;
    private final Player player;
    private final ItemStack item;
    private boolean cancelled;

    /**
     * Constructs a new PyroFishCatchEvent.
     *
     * @param player   The player who caught the fish.
     * @param tierId   The ID of the tier the fish belongs to (e.g., "Mythical").
     * @param fishId   The internal identifier of the fish caught.
     * @param hotspot  Whether the fish was caught with hotspot.
     * @param item     The actual ItemStack representation of the caught fish.
     */
    public PyroFishCatchEvent(Player player, String tierId, String fishId, boolean hotspot, ItemStack item) {
        this.tierId = tierId;
        this.fishId = fishId;
        this.hotspot = hotspot;
        this.player = player;
        this.item = item;
    }

    /**
     * Gets the tier ID of the caught fish.
     *
     * @return The tier ID (e.g., "Mythical").
     */
    public String getTier() {
        return tierId;
    }

    /**
     * Gets the unique internal ID of the fish that was caught.
     *
     * @return The fish ID.
     */
    public String getFishId() {
        return fishId;
    }

    /**
     * Returns whether the fish was caught through hotspot.
     *
     * @return True if the fish was caught from hotspot, false otherwise.
     */
    public boolean isHotspot() {
        return hotspot;
    }

    /**
     * Gets the player who caught the fish.
     *
     * @return The catching player.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Gets the ItemStack that represents the caught fish.
     *
     * @return The caught fish as an ItemStack.
     */
    public ItemStack getItemStack() {
        return item;
    }

    /**
     * Checks if this event is cancelled.
     *
     * @return True if the event is cancelled, preventing the fish from being added to the player's inventory.
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Sets the cancellation state of this event.
     *
     * @param cancelled True to cancel the event and prevent the fish from being caught.
     */
    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}

