package commands.game;

/**
 * Loads a game from the /saves directory on the server
 */
public class LoadCommand extends GameCommand {

    public LoadCommand(String fileName) {
        this.fileName = fileName;
    }

    private String fileName;

    public class FailedGameLoadException extends Exception{}


    /**
     * Loads a game from the /saves directory on the server
     * Pre A previously saved game with the specified file name
     * exists on the server in the /saves directory
     * Post The client loads the game state from the specified
     * file on the server.
     */
    @Override
    public void serverExecute() {

    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
