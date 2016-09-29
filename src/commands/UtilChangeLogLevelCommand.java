package commands;

/**
 * Command to change the logging level
 */
public class UtilChangeLogLevelCommand extends BaseCommand{

    /**
     * New level that is to be logged at
     */
    private String logLevel;

    /**
     * The logging level provided is not one of the valid values:
     * SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST
     */
    public class InvalidLogLevelException extends Exception{}

    public class FailedChangeLogLevelException extends Exception{}


    /**
     * Changes the logging level on the server
     * pre     The logging level is one of the valid values
     * post    A 200 response code is returned and the server is using the new logging level
     */
    @Override
    public void serverExecute() {

    }

}

