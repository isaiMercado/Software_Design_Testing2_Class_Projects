package commands.game;

/**
 * Gets a list of games from the server
 */
public class ListCommand extends GameCommand {

    /**
     * Thrown when the command fails to get the list of games
     */
    public class FailedGameListException extends Exception{}


    /**
     * Gets a list of games from the server
     * Post Returns a HTTP success response and a JSON array of game info objects
     */
    @Override
    public void serverExecute() {

    }
}
