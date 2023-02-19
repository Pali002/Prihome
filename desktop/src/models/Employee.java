package models;

public class Employee {
    String city;
    String address;
    Double size;
    Double salary;

    public Employee(String city, String address, Double size, Double salary) {

        this.city = city;
        this.address = address;
        this.size = size;
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Double getSize() {
        return size;
    }
    public void setSize(Double size) {
        this.size = size;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
}
