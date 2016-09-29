package model;

import shared.definitions.ResourceType;
import shared.locations.HexLocation;

/**
 * Port where a player may perform maritime trading
 */
public class Hex {

    /**
     * Location of the hex on the map
     */
    private HexLocation location;

    /**
     * Resource that can be received from the hex
     */
    private ResourceType resource;

    /**
     * Number for resource production on dice rolls
     */
    private int number;


    public Hex(HexLocation location, ResourceType resource, int number) {
        this.location = location;
        this.resource = resource;
        this.number = number;
    }
}

