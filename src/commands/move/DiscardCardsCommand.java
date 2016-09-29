package commands.move;

import model.Resources;

public class DiscardCardsCommand extends MoveCommand {

    /**
     * Total amount of resources that can be discarded
     */
    private Resources resources;

    /**
     * Player does not have 7 cards or does not have the resources they are trying to discard.
     */
    public class InvalidDiscardException extends Exception{}


    /**
     * Attempts to discard cards
     * pre     make sure the sources in player's hand has 7 or more. Players can chose the cards to discard.
     * The client model will change to "Discarding"
     *
     * post    Players give up the chosen resources. When discarding is done the client model is changed to Robbing
     */
    @Override
    public void serverExecute() {

    }

}