package me.PyroAPI.Interfaces;

/**
 * Represents a player's farming-related statistics and progress within PyroFarming.
 * Provides methods to access and modify the player's farming level, experience,
 * elysium, and other useful information.
 */
public interface PyroFarmingPlayer {

    /**
     * Gets the current farming level of the player.
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
     * Gets the current amount of elysium the player has accumulated.
     *
     * @return the player's elysium as an integer.
     */
    int getElysium();
}
