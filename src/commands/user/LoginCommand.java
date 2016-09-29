package commands.user;

/**
 * Command used to login users on the server
 */
public class LoginCommand extends UserCommand {

    /**
     * Implements parent constructor to set username and password
     * @param username
     * @param password
     */
    public LoginCommand(String username, String password){
        super(username,password);
    }

    /**
     * Thrown when a user supplies null or invalid credentials
     */
    public class FailedLoginException extends Exception{}


    /**
     * Executes same command on server side
     * Pre username and password are not null, user registered on server
     * Post HTTP Success response returned and catan.user cookie is set in ServerProxy
     */
    @Override
    public void serverExecute() {

    }
}
