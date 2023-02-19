/*
* File: Properties.java
* Author: Zentai Pál
* Copyright: 2023, Zentai Pál
* Group: Szoft-II-N
* Date: 2023-02-19
* Github: https://github.com/Pali002/
* Licenc: GNU GPL
*/


package models;

public class Properties {
    String city;
    String address;
    Double size;
    Double price;

    public Properties(String city, String address, Double size, Double price) {

        this.city = city;
        this.address = address;
        this.size = size;
        this.price = price;
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
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    
}
