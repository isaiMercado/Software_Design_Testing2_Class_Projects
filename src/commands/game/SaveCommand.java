package commands.game;

/**
 * Used for testing and debugging. Saves game file in /saves directory on server
 */
public class SaveCommand extends GameCommand {

    public SaveCommand(String gameID, String fileName) {
        this.gameID = gameID;
        this.fileName = fileName;
    }

    /**
     * Thrown when game fails to be saved on server
     */
    public class FailedGameSaveException extends Exception{}

    /**
     * The game that is being saved
     */
    private String gameID;

    /**
     * The file name to use for the saved game
     */
    private String fileName;


    /**
     * Used for testing and debugging. Saves game file in /saves directory on server
     * Pre gameID and fileName are both valid
     * Post HTTP Success, and game state stored in /saves directory under given file name
     */
    @Override
    public void serverExecute() {

    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
