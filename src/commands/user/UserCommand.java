package commands.user;

import commands.BaseCommand;

/**
 * Parent class for user related commands
 */
public abstract class UserCommand extends BaseCommand{

    /**
     * Constructor for UserCommand. To be implemented by children
     * @param username
     * @param password
     */
    protected UserCommand(String username, String password){
        this.username = username;
        this.password = password;
    }

    /**
     * Username for the command
     */
    private String username;

    /**
     * Password corresponding to the user
     */
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

