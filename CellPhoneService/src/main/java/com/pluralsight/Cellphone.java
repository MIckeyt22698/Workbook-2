package com.pluralsight;

public class Cellphone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    public Cellphone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.owner = "";
        this.phoneNumber = "";
    }
    public void printInfo(){
        System.out.println("Serial Number:" + serialNumber);
        System.out.println("Model: " + model);
        System.out.println("Carrier: " + carrier);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Owner: " + owner);
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhoneNUmber() {
        return phoneNumber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNumber = phoneNUmber;
    }
}
