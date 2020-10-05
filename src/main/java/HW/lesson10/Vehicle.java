package main.java.HW.lesson10;

public class Vehicle {

    private String madeIn;
    private String usage;
    private String color;

    public Vehicle(String madeIn, String usage, String color) {
        this.madeIn = madeIn;
        this.usage = usage;
        this.color = color;
    }

    public String getUsage() {
        return usage;
    }

    public String getColor() {
        return color;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMadeIn() {
        return madeIn;
    }


    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }


    public String getVehicleInfo() {
        return " General info about the vehicle: \nMade in: " + this.madeIn + "\n usage: "+ this.usage + " \ncolor: " + this.color;
    }
}
