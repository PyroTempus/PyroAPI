package me.PyroAPI.Interfaces;

import java.util.List;
import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Interface representing the core API for PyroFishingPro.
 * Provides methods to query fish data, player fishing information,
 * and tournament status, alongside some utility methods.
 */
public interface PyroFishingProAPI {
    
    /**
     * Retrieves a map of all fish categorised by their tier IDs.
     * 
     * The returned map's keys are tier identifiers (e.g., "divine", "mythical"),
     * and the values are lists of fish IDs belonging to each tier.
     * 
     * @return an unmodifiable map where each key is a fish tier ID and
     *         the corresponding value is a list of fish IDs within that tier.
     */
    Map<String, List<String>> getAllFishes();
    
    /**
     * Determines whether the provided {@link ItemStack} represents a valid fish.
     * 
     * This method checks if the given item stack matches any known fish item
     * within PyroFishingPro.
     * 
     * @param fishItemStack the {@link ItemStack} to check
     * @return {@code true} if the item stack is a valid fish; {@code false} otherwise
     */
    boolean isFishItemStack(ItemStack fishItemStack);
    
    /**
     * Retrieves the sell price of the given fish {@link ItemStack}.
     * 
     * If the item stack does not represent a valid fish, this method may return 0 or a default value.
     * 
     * @param fishItemStack the fish item stack to query
     * @return the sell price of the fish as a {@code double}
     */
    double getFishSellPrice(ItemStack fishItemStack);
    
    /**
     * Checks if the provided fish {@link ItemStack} is a "shiny" fish.
     * 
     * Shiny fish typically have special visual effects or rarity.
     * 
     * @param fishItemStack the fish item stack to check
     * @return {@code true} if the fish is shiny; {@code false} otherwise
     */
    boolean isShinyFish(ItemStack fishItemStack);

    /**
     * Retrieves the fishing rod currently held by the specified player.
     * 
     * This method accounts for cases where a player may hold multiple rods,
     * returning the one that is actively being used for fishing.
     * 
     * @param player the player whose fishing rod to retrieve
     * @return the {@link ItemStack} representing the fishing rod currently used by the player,
     *         or {@code null} if none is found
     */
    ItemStack getPlayerFishingRod(Player player);
    
    /**
     * Returns the tier ID of the given fish {@link ItemStack}.
     * 
     * This tier ID corresponds to the classification of the fish (e.g., "gold", "platinum").
     * 
     * @param item the fish item stack to query
     * @return the tier ID as a {@link String}, or {@code null} if the item is not a valid fish
     */
    String getFishTier(ItemStack item);
    
    /**
     * Checks whether a fishing tournament is currently active.
     * 
     * @return {@code true} if a tournament is active; {@code false} otherwise
     */
    boolean isTournamentActive();
    
    /**
     * Gets the ID of the currently active fishing tournament.
     * 
     * If no tournament is active, this method will return an empty string.
     * 
     * @return the active tournament's ID as a {@link String}, or {@code null} if no tournament is active
     */
    String getActiveTournamentId();
    
    /**
     * Retrieves detailed fishing-related statistics for the specified player.
     * 
     * This includes data such as fishing level, experience points (XP), entropy,
     * and other player-specific stats managed by PyroFishingPro.
     * 
     * @param player the player whose statistics to retrieve
     * @return a {@link PyroFishingProPlayer} object containing the player's fishing stats,
     *         or {@code null} if the player is not online or invalid.
     */
    PyroFishingProPlayer getPyroFishingProPlayer(Player player);
    
}

