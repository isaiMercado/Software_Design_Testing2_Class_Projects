package server;


import com.google.gson.Gson;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

        import java.util.Random;

        import static org.junit.Assert.assertEquals;

/**
 * Created by Isai on 9/22/2016.
 */
public class HttpProxyTest {

    private HttpProxy httpProxy;
    private Gson gson;

    @Before
    public void setUp() {
        httpProxy = new HttpProxy("localhost", "8081");
        gson = new Gson();
    }

    /**
     * Tears down the test fixture.
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {

    }

    @Test
    public void Login() {
        try {
            String json_input = "{ \"username\": \"Sam\",\n" +
                                "  \"password\": \"sam\" }";
            String json_output = this.httpProxy.post("/user/login", json_input, Cookie.Type.NoRequired);
            assertEquals(json_output, "Success");
        } catch (Exception e) {
            assertEquals(true, false);
        }
    }


    @Test
    public void RegisterUser() {
        try {
//            Random rand = new Random();
//            String json_input = "{\"username\": " + String.valueOf(rand.nextDouble()) + ", " +
//                                "\"password\": " + String.valueOf(rand.nextDouble()) + "}";
//            String json_output = this.httpProxy.post("/user/register", json_input, Cookie.Type.NoRequired);
//            assertEquals(json_output, "Success");
        } catch (Exception e) {
            System.out.print("\n" + e.getMessage());
            assertEquals(true, false);
        }
    }


    @Test
    public void GetGamesList() {
        try {
            String json_input = "";
            String json_output = this.httpProxy.post("/games/list", json_input, Cookie.Type.NoRequired);
            gson.fromJson(json_output, Object.class);
        } catch (Exception e) {
            System.out.print("\n" + e.getMessage());
            assertEquals(true, false);
        }
    }


    @Test
    public void CreateGame() {
        try {
            String json_input = "{\"name\":\"Sam\"," +
                                "\"randomTiles\": true," +
                                "\"randomNumbers\": true," +
                                "\"randomPorts\": true}";
            String json_output = this.httpProxy.post("/games/list", json_input, Cookie.Type.NoRequired);
            assertEquals(json_output, "[{\"title\":\"Default Game\",\"id\":0,\"players\":[{\"color\":\"orange\",\"name\":\"Sam\",\"id\":0},{\"color\":\"blue\",\"name\":\"Brooke\",\"id\":1},{\"color\":\"red\",\"name\":\"Pete\",\"id\":10},{\"color\":\"green\",\"name\":\"Mark\",\"id\":11}]},{\"title\":\"AI Game\",\"id\":1,\"players\":[{\"color\":\"orange\",\"name\":\"Pete\",\"id\":10},{\"color\":\"purple\",\"name\":\"Scott\",\"id\":-2},{\"color\":\"puce\",\"name\":\"Steve\",\"id\":-3},{\"color\":\"white\",\"name\":\"Quinn\",\"id\":-4}]},{\"title\":\"Empty Game\",\"id\":2,\"players\":[{\"color\":\"orange\",\"name\":\"Sam\",\"id\":0},{\"color\":\"blue\",\"name\":\"Brooke\",\"id\":1},{\"color\":\"red\",\"name\":\"Pete\",\"id\":10},{\"color\":\"green\",\"name\":\"Mark\",\"id\":11}]}]");
        } catch (Exception e) {
            assertEquals(true, false);
        }
    }


    @Test
    public void JoinGame() {
        try {
            String json_input = "";
            String json_output = this.httpProxy.post("/games/list", json_input, Cookie.Type.NoRequired);
        } catch (Exception e) {
            assertEquals(true, false);
        }
    }


    @Test
    public void GetModel() {
        try {
            String json_input = "";
            String json_output = this.httpProxy.post("/games/list", json_input, Cookie.Type.NoRequired);
        } catch (Exception e) {
            assertEquals(true, false);
        }
    }


    @Test
    public void Reset() {
        try {
            String json_input = "";
            String json_output = this.httpProxy.post("/games/list", json_input, Cookie.Type.NoRequired);
        } catch (Exception e) {
            assertEquals(true, false);
        }
    }


    @Test
    public void CreateGame566() {
        try {
            String json_input = "";
            String json_output = this.httpProxy.post("/games/list", json_input, Cookie.Type.NoRequired);
        } catch (Exception e) {
            assertEquals(true, false);
        }
    }


    @Test
    public void httpPost_BadEndPoint() {
        try {
            String json_input = "{ \"username\": \"SAM\",\n" +
                                "  \"password\": \"sam\" }";
            String json_output = this.httpProxy.post("/user/logewein", json_input, Cookie.Type.NoRequired);
            assertEquals(false, true);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Bad Request");
        }
    }

    @Test
    public void httpPost_BadJson() {
        try {
            String json_input = "hola={<html></htmlstuff>}";
            String json_output = this.httpProxy.post("/user/login", json_input, Cookie.Type.NoRequired);
            assertEquals(false, true);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Bad Json");
        }
    }

}