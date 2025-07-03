package me.PyroAPI.Events.PyroFarming;

import me.PyroAPI.Events.PyroBaseEvent;

/**
 * Called when a farming tournament starts.
 * <p>
 * This event is fired at the beginning of a tournament, providing the type of the tournament
 * and the total duration it will run for.
 *
 * <p>Example usage:
 * <pre>{@code
 * @EventHandler
 * public void onTournamentStart(FarmingTournamentStartEvent event) {
 *     Bukkit.broadcastMessage("A " + event.getTournamentType() + " tournament has started!");
 * }
 * }</pre>
 */
public class FarmingTournamentStartEvent extends PyroBaseEvent {

    /** The name for the tournament type (e.g., "Most Sugarcane"). */
    private final String tournamentType;

    /** Duration of the tournament in seconds. */
    private final int duration;

    /**
     * Constructs a new FishingTournamentStartEvent.
     *
     * @param tournamentType The name of the tournament.
     * @param duration       The total duration of the tournament in seconds.
     */
    public FarmingTournamentStartEvent(String tournamentType, int duration) {
        this.tournamentType = tournamentType;
        this.duration = duration;
    }

    /**
     * Gets the tournament name.
     *
     * @return The type of the tournament (e.g., "Most Sugarcane").
     */
    public String getTournamentType() {
        return tournamentType;
    }

    /**
     * Gets the duration of the tournament in seconds.
     *
     * @return The total duration of the tournament.
     */
    public int getDuration() {
        return duration;
    }
}

