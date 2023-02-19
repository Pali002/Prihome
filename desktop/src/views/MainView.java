package views;

import java.util.ArrayList;

import models.Properties;

public class MainView {
    
    public MainView() {

    }

    public void outProperties(ArrayList<Properties> props) {
        for(Properties prop: props) {
            System.out.printf(
                "|%15s|%15s|%15s|%15s|\n",
                prop.getCity(),
                prop.getAddress(),
                prop.getSize(),
                prop.getSalary()
            );
        }
    }
}
