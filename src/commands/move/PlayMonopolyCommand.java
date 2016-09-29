package commands.move;

import shared.definitions.ResourceType;

/**
 * Command used to play a monopoly development card
 */
public class PlayMonopolyCommand extends MoveCommand {

    /**
     * Resource being taken from the other players
     */
    private ResourceType resource;


    /**
     * Attempts to play a monopoly development card
     * pre     None
     * post    Player has received all resources of the given type from all other players
     */
    @Override
    public void serverExecute() {

    }
}
