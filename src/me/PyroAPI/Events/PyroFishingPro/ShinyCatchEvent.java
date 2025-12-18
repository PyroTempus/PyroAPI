package me.PyroAPI.Events.PyroFishingPro;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.PyroAPI.Events.PyroBaseEvent;

/**
 * Event called when a player successfully catches a "shiny" custom fish
 * using the PyroFishingPro system. 
 *
 * <p>This event is fired after the initial PyroFishCatchEvent.</p>
 *
 * <p>Example usage:
 * <pre>{@code
 * @EventHandler
 * public void onShinyCatch(ShinyCatchEvent event) {
 *     if(event.getTier().equals("Mythical")) {
 *         event.setCancelled(true); // prevent catching Mythical-tier shinies
 *     }
 * }
 * }</pre>
 */
public class ShinyCatchEvent extends PyroBaseEvent {

    private final String tierId;
    private final String fishId;
    private final Player player;
    private final ItemStack item;

    /**
     * Constructs a new ShinyCatchEvent.
     *
     * @param player The player who caught the fish.
     * @param tierId The ID of the tier the fish belongs to (e.g., "Mythical").
     * @param fishId The internal identifier of the fish that was caught.
     * @param item   The ItemStack representation of the caught fish.
     */
    public ShinyCatchEvent(Player player, String tierId, String fishId, ItemStack item) {
        this.tierId = tierId;
        this.fishId = fishId;
        this.player = player;
        this.item = item;
    }

    /**
     * Gets the tier ID of the caught fish.
     *
     * @return the tier ID (for example, "Mythical").
     */
    public String getTier() {
        return tierId;
    }

    /**
     * Gets the internal ID of the fish that was caught.
     *
     * @return the fish ID.
     */
    public String getFishId() {
        return fishId;
    }

    /**
     * Gets the player who caught the fish.
     *
     * @return the player who caused this event.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Gets the ItemStack that will be (or was) given to the player for this catch.
     *
     * @return the caught fish as an ItemStack.
     */
    public ItemStack getItemStack() {
        return item;
    }
    
}