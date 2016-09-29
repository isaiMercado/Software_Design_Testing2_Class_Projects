package model;

import shared.locations.EdgeLocation;
import shared.locations.HexLocation;
import shared.locations.VertexLocation;

import java.util.Map;
import java.util.Map.Entry;

/**
 *
 */
public class CatanMap {

    /**
     * Map object of all the hex locations.
     */
    private Map<HexLocation, Hex> hexes;

    /**
     * Map object of all the port locations.
     */
    private Map<VertexLocation, Port> ports;

    /**
     * Map object of all the road locations.
     */
    private Map<EdgeLocation, Road> roads;

    /**
     * Map object of all the settlement locations.
     */
    private Map<VertexLocation, Settlement> settlements;

    /**
     * Map object of all the city locations.
     */
    private Map<VertexLocation, City> cities;

    /**
     *
     */
    private Integer radius;

    /**
     * Robber object that controls the robber hex location.
     */
    private Robber robber;

    public Map<HexLocation, Hex> getHexes() {
        return hexes;
    }

    public void setHexes(Map<HexLocation, Hex> hexes) {
        this.hexes = hexes;
    }

    public Map<VertexLocation, Port> getPorts() {
        return ports;
    }

    public void setPorts(Map<VertexLocation, Port> ports) {
        this.ports = ports;
    }

    public Map<EdgeLocation, Road> getRoads() {
        return roads;
    }

    public void setRoads(Map<EdgeLocation, Road> roads) {
        this.roads = roads;
    }

    public Map<VertexLocation, Settlement> getSettlements() {
        return settlements;
    }

    public void setSettlements(Map<VertexLocation, Settlement> settlements) {
        this.settlements = settlements;
    }

    public Map<VertexLocation, City> getCities() {
        return cities;
    }

    public void setCities(Map<VertexLocation, City> cities) {
        this.cities = cities;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public Robber getRobber() {
        return robber;
    }

    public void setRobber(Robber robber) {
        this.robber = robber;
    }

    /**
     * This method will build a particular building.
     * @param building
     */
    public void build(Building building) {

        if (building instanceof Road){
            roads.put(((Road)building).getLocation(),((Road)building));
        }

        if (building instanceof Settlement) {
            settlements.put(((Settlement)building).getLocation(),((Settlement)building));
        }

        if (building instanceof City){
            cities.put(((City)building).getLocation(),((City)building));
        }
    }

    /**
     * This method will move the robber to a specific HexLocation on the map.
     * @param location
     */
    public void moveRobber(HexLocation location) {
        robber.setLocation(location);
    }

    /**
     * This method will initialize a new Map for a new game.
     */
    public void newMap() {
        
    }
}
