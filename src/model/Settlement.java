package model;

import shared.locations.VertexLocation;

/**
 * Settlement that a player can buy
 */
public class Settlement extends Building {

    /**
     * Location of the settlement on the map
     */
    private VertexLocation location;

    public void setLocation(VertexLocation l){
        location = l;
    }

    public VertexLocation getLocation(){
        return location;
    }
}

