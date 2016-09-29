package commands.game;

public class POSTCommandsCommand extends GameCommand {

    public class FailedPOSTCommandsException extends Exception{}


    /**
     * attempt to do POST
     *
     * pre     Require the caller has already previously logged in to the server and joined a game
     *
     * post    passed-in command list has been applied to the game.
     * The server will return HTTP 200 success response.
     * The body contains the game's update client model JSON.
     */
    @Override
    public void serverExecute() {

    }
}