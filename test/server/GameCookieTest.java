package server;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by isai on 9/28/16.
 */
public class GameCookieTest {

    private GameCookie gamCookie;

    @Before
    public void setUp() {
        gamCookie = new GameCookie();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void Cookie_BadEncoding() {
        try {
            gamCookie.setEncodedData("dasdkasl/sda23@#%^&*");
            assertEquals(true, false);
        } catch(Exception e) {
            assertEquals(e.getMessage(), "Bad Encoding");
        }
    }


    @Test
    public void Cookie_BadJson() {
        try {
            gamCookie.setEncodedData("catan.user=name%22%3A%22Sam%22%2C%22password%22%3A%22sam%22%2C%22playerID%22%3A0%7D;Path=/;");
            assertEquals(true, false);
        } catch(Exception e) {
            assertEquals("Bad Json", e.getMessage());
        }
    }

}