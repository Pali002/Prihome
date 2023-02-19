/*
* File: MainView.java
* Author: Zentai Pál
* Copyright: 2023, Zentai Pál
* Group: Szoft-II-N
* Date: 2023-02-19
* Github: https://github.com/Pali002/
* Licenc: GNU GPL
*/

package views;

import java.util.ArrayList;

import models.Properties;

public class MainView {
    
    public MainView() {

    }

    public void outProperties(ArrayList<Properties> props) {
        for(Properties prop: props) {
            System.out.printf(
                "|%15s|%20s|%15s|%15s|\n",
                prop.getCity(),
                prop.getAddress(),
                prop.getSize(),
                prop.getPrice()
            );
        }
    }
}
