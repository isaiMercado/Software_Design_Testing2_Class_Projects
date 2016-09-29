package model;

/**
 * Bank controls all the resources.
 */
public class Bank {

    /**
     * Keeps track of the amount of resources in the bank.
     */
    private Resources resources;

    /**
     * This method will take the numRolled from the dice and will issue
     * resources to players based on their location on the map.
     * @param numRolled
     * @param catanMap
     */
    public void giveResources(int numRolled, CatanMap catanMap) {

    }

    /**
     * This method will give a Player a Buyable object (dev card and such)
     * and will remove the resouces required to buy the object.
     * @param buyable
     * @param player
     */
    public void buy(Buyable buyable, Player player) {

    }

    /**
     * This method executes a trade based on what is being offered.
     * @param offer
     */
    public void trade(TradeOffer offer) {

    }

    /**
     * This method will give the player who played the YOP card the benefits
     * gained from this card and from the other players.
     * @param player
     */
    public void yearOfPlenty(Player player) {

    }
}
