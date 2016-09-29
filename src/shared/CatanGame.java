package shared;

import commands.BaseCommand;
import model.CatanModel;
import model.Player;
import server.ServerPoller;
import server.ServerProxy;

/**
 * Facade object to be used as an intermediary between the controllers and the model
 */
public class CatanGame {

    /**
     * Proxy to be used for sending commands to the server
     */
    private ServerProxy serverProxy;

    /**
     * Poller for updating the model on a timed interval
     */
    private ServerPoller serverPoller;

    /**
     * Model containing all of the data for the game
     */
    private CatanModel catanModel;

    /**
     * The player who is using this client so that the controller has a way to access the "can" methods in the game
     */
    private static Player player;

    /**
     * Executes command by sending it to the server, which returns the updated model
     * @param command  Command to be executed
     */
    public void executeCommand(BaseCommand command) {

    }

    /**
     * Updates the model for the Catan model
     * @param json  JSON-serialized model from server response
     */
    public void updateModel(String json) {

    }
}
