package commands.move;

/**
 * Command used to play a monument development card
 */
public class PlayMonumentCommand extends MoveCommand {

    /**
     * Player does not have enough monuments to win game
     */
    public class InsufficientMonumentsException extends Exception{}


    /**
     * Attempts to play monument development card
     * pre     Player has enough monument cards to win the game
     * post    Player gains a victory point
     */
    @Override
    public void serverExecute() {

    }
}
