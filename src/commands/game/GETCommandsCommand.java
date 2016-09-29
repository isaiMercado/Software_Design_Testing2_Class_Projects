package commands.game;

/**
 * Gets a list of the command history from the server. Used for testing and debugging
 */
public class GETCommandsCommand extends GameCommand {

    public GETCommandsCommand() {
    }

    /**
     * The command history was not retrieved from the server
     */
    public class FailedGETCommandsException extends Exception{}


    /**
     * Gets a list of the command history from the server. Used for testing and debugging
     * Pre User must be logged in and in a game (valid game and user cookies)
     * Post Returns an array with the command history. For server created games,
     * history is from after initial placement on. For user created games, history is
     * from before initial placement rounds.
     */
    @Override
    public void serverExecute() {

    }
}
