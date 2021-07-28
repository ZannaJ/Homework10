package com.company.bardy;

public class Bardy extends com.company.bardy.Car {

    // Define the properties of Bardy.
    private int noOfSeats;
    private boolean isGoldPlated;


    // Define constructor
    public Bardy(int noOfTires, String color, int noOfSeats, boolean isGoldPlated) {
        super(noOfTires, color);
        this.noOfSeats = noOfSeats;
        this.isGoldPlated = isGoldPlated;
    }

    // Define the getters and setters
    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public boolean isGoldPlated() {
        return isGoldPlated;
    }

    public void setGoldPlated(boolean goldPlated) {
        isGoldPlated = goldPlated;
    }
}