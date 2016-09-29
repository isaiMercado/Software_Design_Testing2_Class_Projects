package model;

import com.sun.org.apache.regexp.internal.RE;
import shared.definitions.ResourceType;

import java.util.Map;

/**
 * Interface for objects that players can buy
 */
public abstract class Buyable {

    /**
     * Cost of how much the object costs
     */
    private Resources cost;

    public void setResources(Resources c){
        cost = c;
    }

    public Resources getResources(){
        return cost;
    }
}

