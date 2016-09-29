package model;

/**
 * Keeps track of which players turn it is and status of the player's turn.
 */
public class TurnTracker {

    /**
     * PlayerID of the player's turn.
     */
    private Integer currentTurn;

    /**
     * Status of the player's turn
     */
    private String status;

    /**
     * PlayerID of the player with the longest road.
     */
    private Integer longestRoad;

    /**
     * PlayerID of the player with the largest army.
     */
    private Integer largestArmy;

    /**
     * Passes the currentTurn int to an integer corresponding to a Player.
     */
    public void passTurn() {

    }
}
