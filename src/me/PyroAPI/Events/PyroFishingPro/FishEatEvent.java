package me.PyroAPI.Events.PyroFishingPro;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.PyroAPI.Events.PyroBaseEvent;

/**
 * Event called when a player eats a custom fish item provided by the
 * PyroFishingPro system.
 *
 * <p>This event is fired after the initial PyroFishCatchEvent, at the point
 * where the fish's eat effects/commands are processed.</p>
 *
 * <p>Example usage:
 * <pre>{@code
 * @EventHandler
 * public void onFishEat(FishEatEvent event) {
 *     if(event.getTier().equals("Mythical")) {
 *         event.setCancelled(true); // prevent eat effects for Mythical-tier fish
 *     }
 * }
 * }</pre>
 */
public class FishEatEvent extends PyroBaseEvent {

    private final String tierId;
    private final String fishId;
    private final Player player;
    private final ItemStack item;
    private final List<String> commands;

    /**
     * Constructs a new FishEatEvent.
     *
     * @param player   The player who ate the fish.
     * @param tierId   The ID of the tier the fish belongs to (e.g., "Mythical").
     * @param fishId   The internal identifier of the fish that was eaten.
     * @param item     The ItemStack representation of the eaten fish.
     * @param commands The list of commands that will be executed when the fish is eaten.
     */
    public FishEatEvent(Player player, String tierId, String fishId, ItemStack item, List<String> commands) {
        this.tierId = tierId;
        this.fishId = fishId;
        this.player = player;
        this.item = item;
        this.commands = commands;
    }

    /**
     * Gets the tier ID of the fish.
     *
     * @return the tier ID (for example, "Mythical").
     */
    public String getTier() {
        return tierId;
    }

    /**
     * Gets the internal ID of the fish that was eaten.
     *
     * @return the fish ID.
     */
    public String getFishId() {
        return fishId;
    }

    /**
     * Gets the player who ate the fish.
     *
     * @return the player who caused this event.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Gets the ItemStack that was eaten.
     *
     * @return the eaten fish as an ItemStack.
     */
    public ItemStack getItemStack() {
        return item;
    }

    /**
     * Gets the list of commands that will be executed for this fish-eat action.
     *
     * @return an immutable-ish list of commands (may be null or empty).
     */
    public List<String> getCommands() {
        return commands;
    }
    
}