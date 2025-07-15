package me.PyroAPI.Interfaces;

import java.util.Map;

/**
 * Represents a player's fishing-related statistics and progress within PyroFishingPro.
 * Provides methods to access and modify the player's fishing level, experience,
 * entropy, and codex completion.
 */
public interface PyroFishingProPlayer {

    /**
     * Gets the current fishing level of the player.
     *
     * @return the player's level as an integer.
     */
    int getLevel();

    /**
     * Gets the player's current experience points (XP).
     *
     * @return the current XP of the player.
     */
    int getCurrentXP();

    /**
     * Gets the experience points required to reach the next level.
     *
     * <p>
     * This value represents the difference between the total XP required for the next
     * level and the player's current XP. For example, if a player needs 1000 XP to level up
     * and currently has 500 XP, this method returns 500.
     * </p>
     *
     * @return the remaining XP needed to level up.
     */
    int getRequiredXP();

    /**
     * Adds experience points (XP) to the player.
     *
     * @param amount the amount of XP to add.
     */
    void addXP(int amount);

    /**
     * Gets the current amount of entropy the player has accumulated.
     *
     * @return the player's entropy as an integer.
     */
    int getEntropy();

    /**
     * Gets the player's progress in completing the fishing codex.
     *
     * @return the codex completion progress as a decimal between 0.00 and 100.00,
     *         where 100.00 indicates full completion.
     */
    double getCodexCompletion();

    /**
     * Gets the players total caught fish.
     *
     * @return a map of the fish name and tier in format: 'tier:fishId' i.e. 'bronze:bass'
     *         and the number of fish caught by the player.
     */
    Map<String, Integer> getFishCaught();

}

