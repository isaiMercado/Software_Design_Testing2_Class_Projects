package commands.move;

import shared.locations.EdgeLocation;

/**
 * Command that lets the user building a road
 */
public class BuildRoadCommand extends MoveCommand {

    /**
     * Whether or not you get this piece for free
     */
    private Boolean free;

    /**
     * The new road’s location
     */
    private EdgeLocation roadLocation;


    /**
     * pre The road location is open
     * pre The road location is connected to another road owned by the player
     * pre The road location is not on water
     * pre You have the required resources (1 wood, 1 brick; 1 road)
     * pre Setup round: Must be placed by settlement owned by the player with no adjacent road
     * post You lost the resources required to build a road (1 wood, 1 brick; 1 road)
     * post The road is on the map at the specified location
     * post If applicable, longest road has been awarded to the player with the longest road
     */
    @Override
    public void serverExecute() {

    }
}
