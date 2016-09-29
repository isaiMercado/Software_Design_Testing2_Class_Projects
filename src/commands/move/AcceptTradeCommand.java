package commands.move;

/**
 * Command used to accept a trade offer
 */
public class AcceptTradeCommand extends MoveCommand {

    /**
     * Whether or not you accept the offered trade
     */
    private Boolean willAccept;


    public AcceptTradeCommand(int playerIndex, boolean willAccept) {
        this.willAccept = willAccept;
        setPlayerIndex(playerIndex);
        setType("acceptTrade");
        setEndpoint("/moves/acceptTrade");
    }

    /**
     * pre You have been offered a domestic trade
     * pre To accept the offered trade, you have the required resources
     * post If you accepted, you and the player who offered swap the specified resources
     * post If you declined no resources are exchanged
     * post The trade offer is removed
     */
    @Override
    public void serverExecute() {

    }
}
