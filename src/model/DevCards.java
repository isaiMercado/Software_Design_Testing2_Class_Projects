package model;

/**
 * Controls a player's hand of development cards.
 */
public class DevCards {

    /**
     * Number of Monopoly cards in a player's hand.
     */
    private int monopolyCards;

    /**
     * Number of Monument cards in a player's hand.
     */
    private int monumentCards;

    /**
     * Number of Road Building cards in a player's hand.
     */
    private int roadBuildingCards;

    /**
     * Number of Soldier cards in a player's hand.
     */
    private int soldierCards;

    /**
     * Number of Year of Plenty cards in a player's hand.
     */
    private int yearOfPlentyCards;


    public void setMonopolyCards(int monoCards){
        monopolyCards = monoCards;
    }

    public int getMonopolyCards(){
        return monopolyCards;
    }

    public void setMonumentCards(int monuCards){
        monumentCards = monuCards;
    }

    public int getMonumentCards(){
        return monumentCards;
    }

    public void setRoadBuildingCards(int rbc){
        roadBuildingCards = rbc;
    }

    public int getRoadBuildingCards(){
        return roadBuildingCards;
    }

    public void setSoldierCards(int sc){
       soldierCards = sc;
    }

    public int getSoldierCards(){
        return soldierCards;
    }

    public void setYearOfPlentyCards(int ypc){
        yearOfPlentyCards = ypc;
    }

    public int getYearOfPlentyCards(){
        return yearOfPlentyCards;
    }
}
