package me.PyroAPI.Interfaces;

import org.bukkit.entity.Player;

public interface PyroMiningAPI {

    /**
     * Checks whether a mining tournament is currently active.
     * 
     * @return {@code true} if a tournament is active; {@code false} otherwise
     */
    boolean isTournamentActive();
    
    /**
     * Gets the ID of the currently active mining tournament.
     * 
     * If no tournament is active, this method will return an empty string.
     * 
     * @return the active tournament's ID as a {@link String}, or {@code null} if no tournament is active
     */
    String getActiveTournamentId();
	
    /**
     * Retrieves detailed mining-related statistics for the specified player.
     * 
     * This includes data such as mining level, experience points, ethera
     * and other player-specific stats managed by PyroMining.
     * 
     * @param player the player whose statistics to retrieve
     * @return a {@link PyroMiningPlayer} object containing the player's mining stats,
     *         or {@code null} if the player is not online or invalid.
     */
    PyroMiningPlayer getPyroMiningPlayer(Player player);
	
}
