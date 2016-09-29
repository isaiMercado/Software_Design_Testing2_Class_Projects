package model;

import shared.locations.HexLocation;

/**
 * Piece that can be used to steal resources or prevent a hex from generating resources
 */
public class Robber {

    /**
     * Location of the robber on the map
     */
    private HexLocation location;


    public Robber(HexLocation location) {
        this.location = location;
    }

    public HexLocation getLocation() {
        return location;
    }

    public void setLocation(HexLocation location) {
        this.location = location;
    }
}

