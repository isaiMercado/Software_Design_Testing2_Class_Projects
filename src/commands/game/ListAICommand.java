package commands.game;

/**
 * Returns a list of supported AI Types
 */
public class ListAICommand extends GameCommand {

    public ListAICommand() {
    }


    /**
     * Returns a list of supported AI Types
     * Post Returns a JSON array of AI Types.
     * Currently there is only one: LARGEST_ARMY
     */
    @Override
    public void serverExecute() {

    }
}
