/*
* File: Restapi.java
* Author: Zentai Pál
* Copyright: 2023, Zentai Pál
* Group: Szoft-II-N
* Date: 2023-02-19
* Github: https://github.com/Pali002/
* Licenc: GNU GPL
*/

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
