package com.company.bardy;

public class Car {

    // Define the properties of the car.
    private int noOfTires;
    private String color;

    // Define the constructor
    public Car(int noOfTires, String color) {
        this.noOfTires = noOfTires;
        this.color = color;
    }

    // Define getters and setters.
    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}