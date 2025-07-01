package me.PyroAPI.Events.PyroFishingPro;

import java.util.Collections;
import java.util.Map;

import me.PyroAPI.Events.PyroBaseEvent;

/**
 * Event fired when a fishing tournament ends.
 * <p>
 * This event contains the tournament type, its duration, whether rewards were given,
 * and the final leaderboard containing player names mapped to their score.
 * <p>
 * Note: This event is only fired once per tournament, and should be treated as read-only.
 */
public class FishingTournamentEndEvent extends PyroBaseEvent {

    private final String tournamentType;
    private final int duration;
    private final boolean rewardsGiven;
    private final Map<String, ? extends Number> leaderboard;

    /**
     * Constructs a new FishingTournamentEndEvent.
     *
     * @param tournamentType The type of tournament that just ended (e.g., "Most Fish").
     * @param duration       The duration of the tournament in seconds.
     * @param rewardsGiven   Whether or not rewards were distributed at the end of the tournament.
     * @param leaderboard    A map of player names to their final score/statistic.
     */
    public FishingTournamentEndEvent(String tournamentType, int duration, boolean rewardsGiven, Map<String, ? extends Number> leaderboard) {
        this.tournamentType = tournamentType;
        this.duration = duration;
        this.rewardsGiven = rewardsGiven;
        this.leaderboard = leaderboard != null ? Collections.unmodifiableMap(leaderboard) : Collections.emptyMap();
    }

    /**
     * Gets the type of tournament.
     *
     * @return The tournament type (e.g., "Most Fish").
     */
    public String getTournamentType() {
        return tournamentType;
    }

    /**
     * Gets the total duration of the tournament in seconds.
     *
     * @return The tournament duration.
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Checks if rewards were given at the end of the tournament.
     * This is always true, unless force-stopped via commands.
     *
     * @return True if rewards were distributed, false otherwise.
     */
    public boolean isRewardsGiven() {
        return rewardsGiven;
    }

    /**
     * Gets the final leaderboard for the tournament.
     * <p>
     * This is an unmodifiable map of player names to their scores.
     *
     * @return The tournament leaderboard.
     */
    public Map<String, ? extends Number> getLeaderboard() {
        return leaderboard;
    }
}

