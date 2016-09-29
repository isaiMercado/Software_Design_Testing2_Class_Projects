package commands.game;

/**
 * Erases the command history and reverts the game back to the beginning
 */
public class ResetCommand extends GameCommand {

    public ResetCommand() {
    }


    /**
     * The game was not reset on the server
     */
    public class FailedGameResetException extends Exception{}


    /**
     * Erases the command history and reverts the game back to the beginning
     * Pre user is logged in and in a game(valid user and game cookies)
     * Post For user created games, game state is reverted to very beginning
     * (before initial placement rounds). For server created games, game
     * state is reverted to just after initial placement.
     * Command history is erased, but players are NOT.
     * Game returns the newly reset model
     */
    @Override
    public void serverExecute() {

    }
}
