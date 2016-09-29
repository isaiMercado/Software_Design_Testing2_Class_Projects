package commands.game;

/**
 * Adds an AI to the game
 */
public class AddAICommand extends GameCommand {

    public AddAICommand() {
    }

    /**
     * Server failed to add the AI to the game
     */
    public class FailedAddAIException extends Exception{}


    /**
     * Adds an AI to the game
     * Pre User must be logged in and in a game(valid game and user cookies)
     * AI type must be valid - (LARGEST_ARMY)
     * Must be adequate space in game to add AI
     * Post AI player added to the game
     */
    @Override
    public void serverExecute() {

    }
}
