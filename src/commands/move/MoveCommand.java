package commands.move;

import commands.BaseCommand;

/**
 * Parent command class for various move commands used by players
 */
public abstract class MoveCommand extends BaseCommand {

    /**
     * The type of move that is to be executed
     */
    private String type;

    /**
     * The index of the player that is making the move
     */
    private int playerIndex;


    protected void setType(String type) {
        this.type = type;
    }

    protected void setPlayerIndex(int playerIndex) {
        this.playerIndex = playerIndex;
    }
}
