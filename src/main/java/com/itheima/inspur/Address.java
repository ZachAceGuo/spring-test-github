package com.itheima.inspur;

public class Address {
    private String prov;
    private String city;
    private String street;
    public void setProv(String prov){
        this.prov = prov;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setStreet(String street){
        this.street = street;
    }
    @Override
    public String toString() {
        return "Address{" +
                "prov='" + prov + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
