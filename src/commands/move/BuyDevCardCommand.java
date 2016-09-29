package commands.move;

/**
 * Command that lets the player to buy a dev card
 */
public class BuyDevCardCommand extends MoveCommand {


    /**
     * pre You have the required resources (1 ore, 1 wheat, 1 sheep)
     * pre There are dev cards left in the deck
     * post You have a new card
     * If it is a monument card, it has been added to your old devcard hand
     * If it is a non­monument card, it has been added to your new devcard hand (unplayable this turn)
     */
    @Override
    public void serverExecute() {

    }
}
