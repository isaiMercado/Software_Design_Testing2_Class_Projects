package commands.move;

import shared.locations.HexLocation;

/**
 * Command to rob a player
 */
public class RobPlayerCommand extends MoveCommand {

    /**
     * The new robber location
     */
    private HexLocation location;

    /**
     * the player you are robbing, or ­1 if you are not robbing anyone
     */
    private int victimIndex;


    /**
     * pre The robber is not being kept in the same location
     * pre If a player is being robbed (i.e., victimIndex != ­1), the player being robbed has resource cards
     * post The robber is in the new location
     * post The player being robbed (if any) gave you one of his resource cards (randomly selected)
     */
    @Override
    public void serverExecute() {

    }
}
