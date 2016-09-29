package server;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by isai on 9/28/16.
 */
public class UserCookieTest {

    private UserCookie userCookie;

    @Before
    public void setUp() {
        userCookie = new UserCookie();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void UserCookie_BadEncoding() {
        try {
            userCookie.setEncodedData("dasdkasl/sda23@#%^&*");
            assertEquals(true, false);
        } catch(Exception e) {
            assertEquals(e.getMessage(), "Bad Encoding");
        }
    }


    @Test
    public void UserCookie_BadJson() {
        try {
            userCookie.setEncodedData("catan.user=name%22%3A%22Sam%22%2C%22password%22%3A%22sam%22%2C%22playerID%22%3A0%7D;Path=/;");
            assertEquals(true, false);
        } catch(Exception e) {
            assertEquals("Bad Json", e.getMessage());
        }
    }


    @Test
    public void UserCookie_GetEncodedCookie() {
        try {
            String encoded_cookie1 = "catan.user=%7B%22name%22%3A%22Sam%22%2C%22password%22%3A%22sam%22%2C%22playerID%22%3A0%7D;Path=/;";
            String decoded_cookie1 = java.net.URLDecoder.decode(encoded_cookie1, "UTF-8");
            userCookie.setEncodedData(encoded_cookie1);
            String encoded_cookie2 = userCookie.getEncodedData();
            String decoded_cookie2 = java.net.URLDecoder.decode(encoded_cookie2, "UTF-8");
            assertEquals(encoded_cookie1, encoded_cookie2);
            assertEquals(decoded_cookie1, decoded_cookie2);
        } catch(Exception e) {
            assertEquals(true, false);
        }
    }

}