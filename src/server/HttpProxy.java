package server;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import commands.BaseCommand;
import commands.game.GETCommandsCommand;
import commands.game.ListAICommand;
import commands.game.ListCommand;
import commands.game.ResetCommand;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import shared.Exceptions.CookieException;
import shared.Exceptions.HttpProxyException;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.google.gson.JsonParser;
import sun.misc.IOUtils;

import javax.xml.ws.http.HTTPException;

/**
 * Server proxy that sends commands to the server via HTTP
 */
public class HttpProxy implements ServerProxy{

    /**
     * Cookie sent in requests for the server to differentiate between users
     */
    private UserCookie userCookie;

    /**
     * Cookie sent in requests for the server to differentiate between games
     */
    private GameCookie gameCookie;

    /**
     * Client that sends HTTP requests and receives HTTP responses
     */
    private HttpClient httpClient;
    private Gson gson;


    private String host;
    private String port;


    public HttpProxy(String host, String port) {
        gameCookie = new GameCookie();
        userCookie = new UserCookie();
        gson = new Gson();
        httpClient = HttpClients.createDefault();
        this.port = port;
        this.host = host;
    }


    public void httpSend(BaseCommand command) throws HttpProxyException, CookieException {
//        String endPoint = command.getEndPoint();
//        String json_request = command.toJson();
//        Cookie.Type cookieType = command.getCookieType();
//
//        String json_response = new String();
//
//        if (command instanceof GETCommandsCommand) {
//
//        } else {
//            json_response = post(endPoint, json_request, cookieType);
//        }
//
//        command.execute(json_response);
    }


    public String post(String endPoint, String json_string, Cookie.Type cookieType) throws HttpProxyException, CookieException {
        try {

            gson.fromJson(json_string, Object.class);

            HttpPost post_request = new HttpPost("http://" + host + ":" + port + "/" + endPoint);
            post_request.setEntity(new ByteArrayEntity(json_string.getBytes("UTF-8")));

            if (cookieType == Cookie.Type.User || cookieType == Cookie.Type.Both) {
                post_request.setHeader("Cookie", userCookie.getEncodedData());
            }
            if (cookieType == Cookie.Type.Game || cookieType == Cookie.Type.Both) {
                post_request.setHeader("Cookie", gameCookie.getEncodedData());
            }

            HttpResponse response = httpClient.execute(post_request);


            if (response.getStatusLine().getStatusCode() != 200) {
                throw new HttpProxyException("Bad Request");
            }


            try {
                String cookie_string = response.getFirstHeader("Set-cookie").getValue();
                if (cookie_string.indexOf("catan.user") != -1) {
                    userCookie.setEncodedData(cookie_string);
                }
                if (cookie_string.indexOf("catan.game") != -1) {
                    gameCookie.setEncodedData(cookie_string);
                }
            } catch (CookieException e) {
                throw e;
            } catch (Exception e) {
                // Ignore the exception if the header does not exist
            }


            String body = EntityUtils.toString(response.getEntity(), "UTF-8");
            return body;

        } catch(UnsupportedEncodingException e) {
            throw new HttpProxyException("Bad Encoding");
        } catch(IOException e) {
            throw new HttpProxyException("Bad Connection");
        } catch (JsonSyntaxException e) {
            throw new HttpProxyException("Bad Json");
        }
    }
}

