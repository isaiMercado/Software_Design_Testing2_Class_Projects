package model;

import shared.locations.VertexLocation;

/**
 * City that a player can buy
 */
public class City extends Building {

    /**
     * Location of the city on the map
     */
    private VertexLocation location;

    public void setLocation(VertexLocation l){
        location = l;
    }

    public VertexLocation getLocation(){
        return location;
    }
}

