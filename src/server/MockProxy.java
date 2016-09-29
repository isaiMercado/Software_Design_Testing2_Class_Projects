package server;

import commands.BaseCommand;
import sun.net.www.http.HttpClient;

/**
 * Mocked server proxy used for testing purposes
 */
public class MockProxy implements ServerProxy{

    /**
     * JSON serialization of the mock model
     */
    private String mockModel;


    public void httpSend(BaseCommand command) {

    }
}

