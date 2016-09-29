package commands.user;

/**
 * Command used to register users on the server
 */
public class RegisterCommand extends UserCommand {

    /**
     * Implements parent constructor to set username and password
     * @param username
     * @param password
     */
    public RegisterCommand(String username, String password){
        super(username,password);
    }

    /**
     * Thrown when a user supplies null credentials or username is already taken
     */
    public class FailedRegistrationException extends Exception{}


    /**
     * Executes command on the server side
     * Registers a new user on the server
     * Pre username and password not null, username not already taken on the server
     * Post user is registered on server. HTTP sends Success response and catan.user cookie is set
     */
    @Override
    public void serverExecute() {

    }
}
