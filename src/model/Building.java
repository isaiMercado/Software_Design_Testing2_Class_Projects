package model;

import shared.definitions.ResourceType;

import java.util.Map;

/**
 * Building that a player can buy and place on the map
 */
public abstract class Building extends Buyable {

    /**
     * Index of the player who owns the building
     */
    private int owner;

    /**
     * Number of victory points the building is worth
     */
    private int victoryPointValue;

    public void setOwner(int o){
        owner = o;
    }

    public int getOwner(){
        return owner;
    }

    public void setVictoryPointValue(int v){
        victoryPointValue = v;
    }

    public int getVictoryPointValue(){
        return victoryPointValue;
    }
}

