package commands.move;

/**
 * Universal exceptions for Move Commands
 */
public class MoveExceptions {

    /**
     * The move type given is invalid
     */
    public class InvalidMoveCommandException extends Exception{}

    /**
     * The player index given is invalid
     */
    public class InvalidPlayerIndexException extends Exception{}

    /**
     * The player does not have sufficient resources to perform a command
     */
    public class InsufficientResourcesException extends Exception{}

    /**
     * The player is trying to do something when it isn't their turn
     */
    public class NotPlayerTurnException extends Exception{}

    /**
     * The player is trying to do a command in the wrong status
     */
    public class NotCorrectTurnStatusException extends Exception{}

    /**
     * Player is trying to build in an invalid location
     */
    public class InvalidBuildLocationException extends Exception{}

    /**
     * Player is trying to play a card they don't have
     */
    public class PlayerDoesntHaveCardException extends Exception{}

    /**
     * Player already used a dev card this turn
     */
    public class PlayerAlreadyUsedDevCardException extends Exception{}
}
