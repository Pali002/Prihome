package views;

import java.util.ArrayList;

import models.Employee;

public class MainView {
    
    public MainView() {

    }

    public void outEmployees(ArrayList<Employee> emps) {
        for(Employee emp: emps) {
            System.out.printf(
                "|%15s|%15s|%15s|%15s|\n",
                emp.getCity(),
                emp.getAddress(),
                emp.getSize(),
                emp.getSalary()
            );
        }
    }
}
