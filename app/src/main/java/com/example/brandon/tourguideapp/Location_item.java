package com.example.brandon.tourguideapp;


public class Location_item {
    private String name;
    private String description;
    private String address;
    private String phone;
    private String hours;
    private String price;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Location_item(String name, String description, String address, String phone, String hours,
                    String price, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.hours = hours;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getHours() {
        return hours;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage(){

        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasPrice(){
        return getPrice() != null;
    }

    public boolean hasPhone(){
        return getPhone() != null;
    }

    public boolean hasAddress(){
        return getAddress() != null;
    }

    public boolean hasHours(){
        return getHours() != null;
    }

    @Override
    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPhone() + "\n" +
                getPrice() + "\n" +
                getHours() + "\n" +
                getImageResourceId()
                ;

        return output;
    }
}
