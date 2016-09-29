package server;

import shared.Exceptions.CookieException;


/**
 * Stores data to be put into the header of requests
 */
public interface Cookie {

    public enum Type {
        User,
        Game,
        Both,
        NoRequired
    }

    public void setEncodedData(String cookie_string) throws CookieException;

    /**
     * Encodes the cookie for usage in HTTP request headers
     * @return  Cookie data in a URL-encoded string
     */
    public String getEncodedData();

}
