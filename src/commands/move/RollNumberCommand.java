package commands.move;

/**
 * Command that lets the user to roll a number
 */
public class RollNumberCommand extends MoveCommand {

    /**
     * Integer in the range 2­12 [the number you rolled]
     */
    private int number;


    /**
     * pre  It is your turn
     * pre The client model’s status is ‘Rolling’
     * post The client model’s status is now in ‘Discarding’ or ‘Robbing’ or ‘Playing’
     */
    @Override
    public void serverExecute() {

    }
}
