package me.PyroAPI.Interfaces;

import org.bukkit.entity.Player;

public interface PyroMiningAPI {

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
