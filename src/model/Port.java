package model;

import shared.definitions.ResourceType;
import shared.locations.VertexLocation;

/**
 * Port where a player may perform maritime trading
 */
public class Port {

    /**
     * Location of the port on the map
     */
    private VertexLocation location;

    /**
     * Resource that can be traded at the port
     */
    private ResourceType resource;

    /**
     * Trading ratio where valid values are 2 or 3
     */
    private int ratio;

    public void setLocation(VertexLocation l) {
      location = l;
    }

    public VertexLocation getLocation(){
        return location;
    }

    public void setResource(ResourceType r){
        resource = r;
    }

    public ResourceType getResource(){
        return resource;
    }

    public void setRatio(int mRatio){
        ratio = mRatio;
    }

    public int getRatio(){
        return ratio;
    }
}

