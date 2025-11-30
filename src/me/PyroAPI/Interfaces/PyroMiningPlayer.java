package me.PyroAPI.Interfaces;

/**
 * Represents a player's farming-related statistics and progress within PyroMining.
 * Provides methods to access and modify the player's mining level, experience,
 * ethera, and other useful information.
 */
public interface PyroMiningPlayer {

    /**
     * Gets the current mining level of the player.
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
     * Gets the current amount of ethera the player has accumulated.
     *
     * @return the player's ethera as an integer.
     */
    int getEthera();
}
