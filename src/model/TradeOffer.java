package model;

/**
 * An offer to trade from one player to another.
 */
public class TradeOffer {

    /**
     * The player that sends the trade offer request.
     */
    private Player sender;

    /**
     * The player that receives the trade offer request.
     */
    private Player receiver;

    /**
     * The resources offered by the sender.
     */
    private Resources offer;

}
