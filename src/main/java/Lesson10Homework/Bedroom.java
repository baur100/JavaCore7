package Lesson10Homework;

public class Bedroom {
    private String type;
    private String brand;
    private int cost;


    public Bedroom ( String type, String brand , int cost) { //full constructor
        this.type = type ;
        this.brand = brand;
        this.cost = cost;
    }


    public Bedroom () {    //default constructor always empty
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    public void printBedroom() {
        System.out.println("Type : " + type + "\n Brand: " + brand + "\n cost :" + cost);
    }



}

