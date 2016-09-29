package commands.move;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.junit.Test;

import static org.junit.Assert.*;

public class AcceptTradeCommandTest {

    private static final String TYPE = "acceptTrade";
    private static final int PLAYER_INDEX = 0;
    private static final boolean WILL_ACCEPT = true;
    private AcceptTradeCommand testCommand = new AcceptTradeCommand(PLAYER_INDEX, WILL_ACCEPT);
    private String expected =
            "{" +
                    "\"willAccept\":" + WILL_ACCEPT + "," +
                    "\"type\":\"" + TYPE + "\"," +
                    "\"playerIndex\":" + PLAYER_INDEX + "}";

    @Test
    public void shouldConvertToJsonProperly() {
        assertEquals(expected, testCommand.toJson());
    }
}