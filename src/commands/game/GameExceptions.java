package commands.game;

/**
 * Universal Game Exceptions
 */
public class GameExceptions {

    /**
     * Thrown when there is not enough space in the game for player to join
     */
    public class InadequateSpaceException extends Exception{}

    /**
     * Thrown when gameID does not exist on server
     */
    public class InvalidGameIDException extends Exception{}

    /**
     * Thrown when file name is invalid
     */
    public class InvalidFileNameException extends Exception{}
}
