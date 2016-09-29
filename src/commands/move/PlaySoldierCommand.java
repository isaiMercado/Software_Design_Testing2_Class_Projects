package commands.move;

/**
 * Command used to play a soldier development card
 */
public class PlaySoldierCommand extends MoveCommand {

    /**
     * Command for robbing the player
     */
    private RobPlayerCommand robPlayer;


    /**
     * Attempts to play soldier development card
     * pre     Robber isn't being kept in the same position,
     * the victim has resource cards if a player is being robbed
     * post    Robber is in the new location,
     * victim has given the player a resource,
     * player gets Largest Army if applicable,
     * player can't play other development cards this turn except for monuments
     */
    @Override
    public void serverExecute() {

    }
}
