package commands.move;

import shared.locations.VertexLocation;

/**
 * Commands that lets the player to buy a city
 */
public class BuildCityCommand extends MoveCommand {

    /**
     * The location of the city
     */
    private VertexLocation vertexLocation;


    /**
     * pre The city location is where you currently have a settlement
     * pre You have the required resources (2 wheat, 3 ore; 1 city)
     * post You lost the resources required to build a city (2 wheat, 3 ore; 1 city)
     * post The city is on the map at the specified location
     * post You got a settlement back
     */
    @Override
    public void serverExecute() {

    }
}
