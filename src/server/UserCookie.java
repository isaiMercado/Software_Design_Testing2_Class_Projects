package server;

import com.google.gson.Gson;
import shared.Exceptions.CookieException;

import java.io.UnsupportedEncodingException;

/**
 * Created by isai on 9/28/16.
 */
public class UserCookie implements Cookie {

    private String name;
    private String password;
    private int playerID;
    private Gson gson;

    public UserCookie() {
        gson = new Gson();
        name = new String();
        password = new String();
        playerID = 0;
    }


    public void setEncodedData(String encoded_string) throws CookieException {
        String decoded_string = new String();

        try {
            decoded_string = java.net.URLDecoder.decode(encoded_string, "UTF-8");
        } catch (Exception e) {
            throw new CookieException("Bad Encoding");
        }

        int startJsonIndex = decoded_string.indexOf("{");
        int endJsonIndex = decoded_string.indexOf("}") + 1;

        if (startJsonIndex == -1 || endJsonIndex == -1) {
            throw new CookieException("Bad Json");
        }

        String cookie_json = decoded_string.substring(startJsonIndex, endJsonIndex);

        UserCookie temp = gson.fromJson(cookie_json, UserCookie.class);
        this.password = temp.password;
        this.name = temp.name;
        this.playerID = temp.playerID;
    }


    /**
     * Encodes the cookie for usage in HTTP request headers
     *
     * @return Cookie data in a URL-encoded string
     */
    public String getEncodedData() {
        String json = "{\"name\":\"" + name + "\"," +
                "\"password\":\"" + password + "\"," +
                "\"playerID\":" + playerID + "}";

        String encoded_json = new String();
        try {
            encoded_json = java.net.URLEncoder.encode(json, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String encoded_data = "catan.user=" + encoded_json + ";Path=/;";
        return encoded_data;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getPlayerID() {
        return playerID;
    }

}
