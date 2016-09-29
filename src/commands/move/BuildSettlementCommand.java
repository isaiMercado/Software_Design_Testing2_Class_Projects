package commands.move;

import shared.locations.VertexLocation;

/**
 * Command that lets the player to build a settlement
 */
public class BuildSettlementCommand extends MoveCommand {

    /**
     * Whether or not you get this piece for free
     */
    private Boolean free;

    /**
     * The location of the settlement
     */
    private VertexLocation vertexLocation;


    /**
     * pre The settlement location is open
     * pre The settlement location is not on water
     * pre The settlement location is connected to one of your roads except during setup
     * pre You have the required resources (1 wood, 1 brick, 1 wheat, 1 sheep; 1 settlement)
     * pre The settlement cannot be placed adjacent to another settlement
     * post You lost the resources required to build a settlement (1 wood, 1 brick, 1 wheat, 1 sheep, 1 settlement)
     * post The settlement is on the map at the specified location
     */
    @Override
    public void serverExecute() {

    }
}
