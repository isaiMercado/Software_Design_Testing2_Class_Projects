package commands.game;

/**
 * Validates the current version if it matches the current version on server,
 * or returns the full game model if not
 */
public class ModelVersionCommand extends GameCommand {

    public ModelVersionCommand(int versionNumber) {
        this.versionNumber = versionNumber;
    }

    private int versionNumber;

    /**
     * The version validation failed
     */
    public class FailedVersionValidationException extends Exception{}


    /**
     * Validates the current version if it matches the current version on server,
     * or returns the full game model if not
     * Pre User has valid catan.user and catan.game cookies
     * (they have logged onto the server and joined a game previously)
     * Post Full model returned if version number did not match or one was not given.
     * If given number matched the server version number, "true" is returned
     */
    @Override
    public void serverExecute() {

    }

    public int getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
    }
}
