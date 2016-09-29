package model;

import shared.locations.*;
import java.util.Map;

/**
 * Player in the CatanModel.
 */
public class Player {

    /**
     * Player name.
     */
    private String name;

    /**
     * Player ID.
     */
    private int playerID;

    /**
     * Amount of cities owned by the player.
     */
    private int cities;

    /**
     * Amount of settlements owned by the player.
     */
    private int settlements;

    /**
     * Amount of roads owned by the player
     */
    private int roads;

    /**
     * Player color.
     */
    private String color;

    /**
     *
     */
    private boolean discarded;

    /**
     * Dev cards gained by the player.
     */
    private DevCards newDevCards;

    /**
     * Dev cards played by the player.
     */
    private DevCards oldDevCards;

    /**
     * Player index controls players turn in line.
     */
    private int playerIndex;

    /**
     * True if player has played a dev card. False if not.
     */
    private boolean playedDevCard;

    /**
     * Controls the amount of each resource owned by the player.
     */
    private Resources resources;

    /**
     * Controls the player's hand of development cards.
     */
    private DevCards devCards;
    
    /**
     * Amount of soldiers played.
     */
    private int soldiers;
     
    /**
     * Amount of monuments played.
     */
    private int monuments; 

    /**
     * Amount of victory points owned by the player.
     */
    private int victoryPoints;

    /**
     * Player Constructor
     * @param name
     * @param playerID
     * @param cities
     * @param settlements
     * @param roads
     * @param color
     * @param discarded
     * @param newDevCards
     * @param oldDevCards
     * @param playerIndex
     * @param playedDevCard
     * @param resources
     * @param devCards
     * @param soldiers
     * @param monuments
     * @param victoryPoints
     */
    public Player(String name, int playerID, int cities, int settlements, int roads, String color,
                  boolean discarded, DevCards newDevCards, DevCards oldDevCards, int playerIndex,
                  boolean playedDevCard, Resources resources, DevCards devCards, int soldiers,
                  int monuments, int victoryPoints) {
        this.setName(name);
        this.setPlayerID(playerID);
        this.setCities(cities);
        this.setSettlements(settlements);
        this.setRoads(roads);
        this.setColor(color);
        this.setDiscarded(discarded);
        this.setNewDevCards(newDevCards);
        this.setOldDevCards(oldDevCards);
        this.setPlayerIndex(playerIndex);
        this.setPlayedDevCard(playedDevCard);
        this.setResources(resources);
        this.setDevCards(devCards);
        this.setSoldiers(soldiers);
        this.setMonuments(monuments);
        this.setVictoryPoints(victoryPoints);
    }


    /**
     * Returns a boolean value if a Player can or cannot build a road on a
     * certain EdgeLocation.
     *
     * @param location
     * @return
     */
    public boolean canBuildRoad(EdgeLocation location) {

        return true;
    }

    /**
     * Returns a boolean value if a Player can or cannot build a city on a
     * certain VertexLocation.
     *
     * @param location
     * @return
     */
    public boolean canBuildCity(VertexLocation location) {

        return true;
    }

    /**
     * Returns a boolean value if a Player can or cannot build a settlement
     * on a certain VertexLocation.
     *
     * @param location
     * @return
     */
    public boolean canBuildSettlement(VertexLocation location) {

        return true;
    }

    /**
     * Returns a boolean value if a Player can or cannot buy a DevCard.
     *
     * @return
     */
    public boolean canBuyDevCard() {

        return true;
    }

    /**
     * Returns a boolean value if a Player can or cannot trade with a
     * particular trade offer.
     *
     * @param tradeOffer
     * @return
     */
    public boolean canTrade(TradeOffer tradeOffer) {

        return true;
    }

    /**
     * Returns a boolean value if the Player can rob another Player.
     *
     * @return
     */
    public boolean canRobPlayer() {

        return true;
    }

    /**
     * Returns a boolean value if the Player can play the Soldier card.
     *
     * @return
     */
    public boolean canPlaySoldier() {

        return true;
    }

    /**
     * Returns a boolean value if the Player can play the Year Of Plenty card.
     *
     * @return
     */
    public boolean canPlayYOP() {

        return true;
    }

    /**
     * Returns a boolean value if the Player can play a Monument card.
     *
     * @return
     */
    public boolean canPlayMonument() {

        return true;
    }

    /**
     * Returns a boolean value if the Player can play a Monopoly card.
     *
     * @return
     */
    public boolean canPlayMonopoly() {

        return true;
    }

    /**
     * Returns a boolean value if the Player can play a Road Building card.
     *
     * @return
     */
    public boolean canPlayRoadBuilding() {

        return true;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getCities() {
        return cities;
    }

    public void setCities(int cities) {
        this.cities = cities;
    }

    public int getSettlements() {
        return settlements;
    }

    public void setSettlements(int settlement) {
        this.settlements = settlement;
    }

    public int getRoads() {
        return roads;
    }

    public void setRoads(int roads) {
        this.roads = roads;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDiscarded() {
        return discarded;
    }

    public void setDiscarded(boolean discarded) {
        this.discarded = discarded;
    }

    public DevCards getNewDevCards() {
        return newDevCards;
    }

    public void setNewDevCards(DevCards newDevCards) {
        this.newDevCards = newDevCards;
    }

    public DevCards getOldDevCards() {
        return oldDevCards;
    }

    public void setOldDevCards(DevCards oldDevCards) {
        this.oldDevCards = oldDevCards;
    }

    public int getPlayerIndex() {
        return playerIndex;
    }

    public void setPlayerIndex(int playerIndex) {
        this.playerIndex = playerIndex;
    }

    public boolean isPlayedDevCard() {
        return playedDevCard;
    }

    public void setPlayedDevCard(boolean playedDevCard) {
        this.playedDevCard = playedDevCard;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public DevCards getDevCards() {
        return devCards;
    }

    public void setDevCards(DevCards devCards) {
        this.devCards = devCards;
    }

    public int getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(int soldiers) {
        this.soldiers = soldiers;
    }

    public int getMonuments() {
        return monuments;
    }

    public void setMonuments(int monuments) {
        this.monuments = monuments;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(int victoryPoints) {
        this.victoryPoints = victoryPoints;
    }
}
