package commands.game;

/**
 * Gets player to join a game on the server
 */
public class JoinCommand extends GameCommand{

    public JoinCommand(String gameID, String color) {
        this.gameID = gameID;
        this.color = color;
    }

    /**
     * Thrown when player was not added to game
     */
    public class FailedJoinGameException extends Exception{}

    /**
     * Thrown when invalid color was given, or color already taken in game
     */
    public class InvalidColorException extends Exception{}


    /**
     * The game the player is joining
     */
    private String gameID;
    /**
     * The desired color of the player
     */
    private String color;


    /**
     * Adds player to a game on the server
     * Pre The game must exist. The color must be valid.
     * The player must already be a member of the game
     * or there must be adequate space to add them.
     * The user must have previously logged onto the server.
     * Post HTTP Success, the player is added to the game
     * with the coordinating color. The catan.game cookie is set
     */
    @Override
    public void serverExecute() {

    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
