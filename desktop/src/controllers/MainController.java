/*
* File: MainController.java
* Author: Zentai Pál
* Copyright: 2023, Zentai Pál
* Group: Szoft-II-N
* Date: 2023-02-19
* Github: https://github.com/Pali002/
* Licenc: GNU GPL
*/

package controllers;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.Properties;
import models.Restapi;
import views.MainView;

public class MainController {
    MainView mainView;
    public MainController() {
        this.mainView = new MainView();
        this.showProp();
    }
    
    private void showProp() {
        Restapi restapi = new Restapi();
        String res = restapi.getProperties();
        ArrayList<Properties> propList = converStringToArray(res);
        this.mainView.outProperties(propList);
    }

    private ArrayList<Properties> converStringToArray(String text) {
        ArrayList<Properties> propList = null;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Properties[] propArray = gson.fromJson(text, Properties[].class);
        propList = new ArrayList<>(Arrays.asList(propArray));
        return propList;
    }
}
