package commands.game;

/**
 * Creates a new game on the server
 */
public class CreateCommand extends GameCommand {

    public CreateCommand(String name, boolean randomTiles, boolean randomNumbers, boolean randomPorts) {
        this.name = name;
        this.randomTiles = randomTiles;
        this.randomNumbers = randomNumbers;
        this.randomPorts = randomPorts;
    }

    /**
     * The name of the game to be created
     */
    private String name;

    /**
     * Will the new game have random tiles, numbers or ports?
     */
    private boolean randomTiles;
    private boolean randomNumbers;
    private boolean randomPorts;

    /**
     * Thrown when the game is not created on the server
     */
    public class FailedGameCreationException extends Exception{}


    /**
     * Creates a new game on the server
     * Pre name is not null. The random booleans all contain either true or false
     * Post The new game is created on the server. HTTP Success response returned
     *       along with a JSON object describing the new game
     */
    @Override
    public void serverExecute() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRandomTiles() {
        return randomTiles;
    }

    public void setRandomTiles(boolean randomTiles) {
        this.randomTiles = randomTiles;
    }

    public boolean isRandomNumbers() {
        return randomNumbers;
    }

    public void setRandomNumbers(boolean randomNumbers) {
        this.randomNumbers = randomNumbers;
    }

    public boolean isRandomPorts() {
        return randomPorts;
    }

    public void setRandomPorts(boolean randomPorts) {
        this.randomPorts = randomPorts;
    }
}
