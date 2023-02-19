package models;

public class Restapi {

    public Restapi() {
    
    }

    public String getProperties() {

        HttpClient httpClient = new HttpClient();
        String host = "http://[::1]:3000/";
        String endpoint = "properties";
        String urlStr = host + endpoint;
        String res = httpClient.get(urlStr);

        return res;
    }
    
}
