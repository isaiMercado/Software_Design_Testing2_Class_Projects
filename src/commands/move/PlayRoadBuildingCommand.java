package commands.move;

import shared.locations.EdgeLocation;

/**
 * Command used to play a road building development card
 */
public class PlayRoadBuildingCommand extends MoveCommand {

    /**
     * Spot for the first road
     */
    private EdgeLocation spot1;

    /**
     * Spot for the second road
     */
    private EdgeLocation spot2;


    /**
     * Attempts to play a road building development card
     * pre     Player has two roads available,
     * both locations connect to one of the player's other roads,
     * neither edge is on the water
     * post    Player has two fewer available roads,
     * map has two new roads,
     * player receives Longest Road if applicable
     */
    @Override
    public void serverExecute() {

    }
}
