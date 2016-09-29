package commands.move;


/**
 * Command user to send chat message to other user/player
 */
public class SendChatCommand extends MoveCommand {
    /**
     * message to chat log while the game is going on.
     */
    private String message;


    /**

     * pre
     *

     * post   everyone see the message in chat log
     *
     */
    @Override
    public void serverExecute() {

    }
}