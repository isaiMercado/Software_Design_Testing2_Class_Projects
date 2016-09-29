package commands.move;

import model.Resources;

/**
 * Command used to offer a trade
 */
public class OfferTradeCommand extends MoveCommand{

    /**
     * Resources offered
     * Negative numbers mean you get those cards
     */
    private Resources offer;

    /**
     * The recipient of the trade offer
     */
    private int playerIndex;


    /**
     * pre  You have the resources you are offering
     * post The trade is offered to the other player (stored in the server model)
     */
    @Override
    public void serverExecute() {

    }
}
