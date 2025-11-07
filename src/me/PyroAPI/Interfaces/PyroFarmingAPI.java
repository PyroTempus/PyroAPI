package me.PyroAPI.Interfaces;

import org.bukkit.entity.Player;

public interface PyroFarmingAPI {

    /**
     * Retrieves detailed fishing-related statistics for the specified player.
     * 
     * This includes data such as farming level, experience points, elysium,
     * and other player-specific stats managed by PyroFishingPro.
     * 
     * @param player the player whose statistics to retrieve
     * @return a {@link PyroFarmingPlayer} object containing the player's farming stats,
     *         or {@code null} if the player is not online or invalid.
     */
    PyroFarmingPlayer getPyroFarmingPlayer(Player player);
	
}
