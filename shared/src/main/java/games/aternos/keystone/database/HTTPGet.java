package games.aternos.keystone.database;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

//todo: api key?/auth header type
public class HTTPGet {

    private String URL;
    private final String apiKey;

    public HTTPGet(String URL, String ApiKey){
        this.URL = URL;
        this.apiKey = ApiKey;
    }

    public <T> T get(Class<T> response){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(this.URL);
        return target.request(MediaType.APPLICATION_JSON).get(response);
    }


}
