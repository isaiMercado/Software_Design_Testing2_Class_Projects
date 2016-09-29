package commands.move;

import shared.definitions.ResourceType;

/**
 * Command used to play a year of plenty development card
 */
public class PlayYearOfPlentyCommand extends MoveCommand {

    /**
     * First resource player wants
     */
    private ResourceType resource1;

    /**
     * Second resource player wants
     */
    private ResourceType resource2;


    /**
     * Attempts to play year of plenty development card
     * pre     Bank has both resources available
     * post    Player gains one of each resource
     */
    @Override
    public void serverExecute() {

    }
}
