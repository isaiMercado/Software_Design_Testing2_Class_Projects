package commands.move;

import model.Resources;

/**
 * Command that lets users apply a maritime trade
 */
public class MaritimeTradeCommand extends MoveCommand {

    /**
     * What you are giving
     */
    private Resources inputResource;

    /**
     * What you are getting
     */
    private Resources outputResource;

    /**
     * 2,3, or 4
     */
    private int ratio;

    /**
     * The player doesn't have the port necessary to get the ratio they desire
     */
    public class PlayerDoesntHavePortException extends Exception{}


    /**
     * pre You have the resources you are giving
     * pre For ratios less than 4, you have the correct port for the trade
     * post The trade has been executed (the offered resources are in the bank, and the requested resource has been received)
     */
    @Override
    public void serverExecute() {

    }
}
