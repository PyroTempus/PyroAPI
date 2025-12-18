package me.PyroAPI.Events.PyroFishingPro;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

import me.PyroAPI.Events.PyroBaseEvent;

/**
 * Called when a player successfully catches a sea creature using the PyroFishingPro system.
 * <p>
 * This event is fired **before** the sea creature is spawned by the player. It is cancellable,
 * meaning you can prevent the creature from being caught entirely (e.g., for restrictions, conditions, etc.).
 * </p>
 * 
 * <p>
 * Example usage:
 * <pre>{@code
 * @EventHandler
 * public void onSeaCreatureCatch(SeaCreatureCatchEvent event) {
 *     if (event.getRarityId().equalsIgnoreCase("Umbral")) {
 *         event.setCancelled(true); // block catching umbral sea creatures
 *     }
 * }
 * </pre>
 * </p>
 */
public class SeaCreatureCatchEvent extends PyroBaseEvent implements Cancellable {

    private final String rarityId;
    private final String creatureId;
    private final Player player;
    private boolean cancelled;

    /**
     * Constructs a new SeaCreatureCatchEvent.
     *
     * @param player     The player who caught the creature.
     * @param rarityId   The rarity tier of the caught creature (e.g., "Mythical").
     * @param creatureId The unique internal ID of the sea creature caught.
     */
    public SeaCreatureCatchEvent(Player player, String rarityId, String creatureId) {
        this.rarityId = rarityId;
        this.creatureId = creatureId;
        this.player = player;
    }

    /**
     * Gets the rarity tier ID of the caught creature.
     *
     * @return The rarity tier ID (e.g., "Umbral").
     */
    public String getRarityId() {
        return rarityId;
    }

    /**
     * Gets the unique internal ID of the sea creature that was caught.
     *
     * @return The creature ID.
     */
    public String getCreatureId() {
        return creatureId;
    }

    /**
     * Gets the player who caught the creature.
     *
     * @return The player who caught the creature.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Checks if this event is cancelled.
     *
     * @return True if the event is cancelled, preventing the creature from being summoned.
     */
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Sets the cancellation state of this event.
     *
     * @param cancelled True to cancel the event and prevent the creature from being caught.
     */
    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}


