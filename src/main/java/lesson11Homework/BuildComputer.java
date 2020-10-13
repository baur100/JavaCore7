package lesson11Homework;

//HW11Plus - create 2 computers:
//1.Create a super class and 3 child classes
//2.Create 2 object of each class (including superclass - don't make it abstract)
//3.Create an interface and 2 classes which implements it
//4.Create 2 objects of each class
//5.Assign one object to interface type

public class BuildComputer {

    protected String type ;
    protected String brand;
    protected int cost;

    public BuildComputer(String type, String brand, int cost) {
        this.type = type;
        this.brand = brand;
        this.cost = cost;
    }

    public BuildComputer() {
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void printComputer(){

       System.out.println(" I am a Computer " + type +  "\n" + " Brand :  "  + brand + "\n total cost is: $ " + cost);
       System.out.println(" I contain the following: ");
    }
}
