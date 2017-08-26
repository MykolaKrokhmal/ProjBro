package com.krokhmal.lessons.lesson013;

public class Address implements Cloneable{
    private String flat;
    private String street;
    private String city;
    private Address address;

    public Address(String flat, String street, String city) {
        this.flat = flat;
        this.street = street;
        this.city = city;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flat='" + flat + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    protected Address clone(){
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
