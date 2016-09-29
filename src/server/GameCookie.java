package server;

import org.apache.commons.lang3.StringUtils;
import shared.Exceptions.CookieException;


/**
 * Created by isai on 9/28/16.
 */
public class GameCookie implements Cookie {

    private int gameID;

    public void setEncodedData(String encoded_string) throws CookieException {
        String decoded_string = new String();
        try {
            decoded_string = java.net.URLDecoder.decode(encoded_string, "UTF-8");
        } catch (Exception e) {
            throw new CookieException("Bad Encoding");
        }

        int startJsonIndex = decoded_string.indexOf("=") + 1;
        int endJsonIndex = decoded_string.indexOf(";");

        String number = decoded_string.substring(startJsonIndex, endJsonIndex);

        if (StringUtils.isNumeric(number) == false) {
            throw new CookieException("Bad Number");
        }

        gameID = Integer.valueOf(number);
    }

    /**
     * Encodes the cookie for usage in HTTP request headers
     *
     * @return Cookie data in a URL-encoded string
     */
    public String getEncodedData() {
        String number = String.valueOf(gameID);
        return number;
    }
}
