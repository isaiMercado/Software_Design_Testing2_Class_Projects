package server;

import commands.BaseCommand;
import shared.Exceptions.CookieException;
import shared.Exceptions.HttpProxyException;

/**
 * Interface implemented by server proxies to send commands to the server
 */
public interface ServerProxy {

    /**
     * Method called by controllers to send a command to the server
     * @param command   Command of any type to be JSON serialized and sent to the server
     */
    public void httpSend(BaseCommand command) throws HttpProxyException, CookieException;
}

