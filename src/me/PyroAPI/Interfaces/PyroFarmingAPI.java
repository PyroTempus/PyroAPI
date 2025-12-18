package me.PyroAPI.Interfaces;

import org.bukkit.entity.Player;

public interface PyroFarmingAPI {

    /**
     * Checks whether a farming tournament is currently active.
     * 
     * @return {@code true} if a tournament is active; {@code false} otherwise
     */
    boolean isTournamentActive();
    
    /**
     * Gets the ID of the currently active farming tournament.
     * 
     * If no tournament is active, this method will return an empty string.
     * 
     * @return the active tournament's ID as a {@link String}, or {@code null} if no tournament is active
     */
    String getActiveTournamentId();
	
    /**
     * Retrieves detailed farming-related statistics for the specified player.
     * 
     * This includes data such as farming level, experience points, elysium,
     * and other player-specific stats managed by PyroFarming.
     * 
     * @param player the player whose statistics to retrieve
     * @return a {@link PyroFarmingPlayer} object containing the player's farming stats,
     *         or {@code null} if the player is not online or invalid.
     */
    PyroFarmingPlayer getPyroFarmingPlayer(Player player);
	
}
