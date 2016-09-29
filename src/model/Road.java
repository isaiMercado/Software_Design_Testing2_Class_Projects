package model;

import shared.locations.EdgeLocation;

/**
 * Road that a player can buy
 */
public class Road extends Building {

    /**
     * Location of the road on the map
     */
    private EdgeLocation location;

    public void setLocation(EdgeLocation l){
        location = l;
    }

    public EdgeLocation getLocation(){
        return location;
    }
}

