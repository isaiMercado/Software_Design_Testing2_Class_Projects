package commands;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import server.ServerProxy;

/**
 * Command to be sent to and executed by the server
 */
public abstract class BaseCommand {

    /**
     * Endpoint on the server the command is to be sent to
     */
    private String endpoint;


    /**
     * Serializes to JSON and sends to server for execution
     * @return JSON serialization of the command
     */
    public String toJson() {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.toJsonTree(this).getAsJsonObject();
        jsonObject.remove("endpoint");
        return jsonObject.toString();
    }

    /**
     * Executes command on the server side
     */
    public abstract void serverExecute();

    protected void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}

