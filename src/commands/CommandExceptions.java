package commands;

/**
 * Universal Command Exceptions
 */
public class CommandExceptions {

    /**
     * The user is not logged in
     */
    public class UserNotLoggedInException extends Exception{}

    /**
     * The user is not currently in a game
     */
    public class UserNotInGameException extends Exception{}

}
