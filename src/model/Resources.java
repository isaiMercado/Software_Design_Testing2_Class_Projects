package model;

import commands.BaseCommand;
import server.ServerProxy;
import shared.definitions.ResourceType;

import java.util.Map;

/**
 * Resource stockpile used for players, trading, and the bank
 */
public class Resources {

    /**
     * Map containing the amount of each resource
     */
    private Map<ResourceType, Integer> resourcesMap;

}

