package Lesson10Homework;

public class Cellphone {

    private int cost ;
    private String name;
    private String brand;

    public Cellphone ( int cost, String name , String brand) { //full constructor
        this.cost = cost ;
        this.name = name;
        this.brand = brand;
    }

    public Cellphone () {    //default constructor always empty
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void printCellPhone(){
        System.out.println("Cost : " + cost + "\n Name: "+ name + "\n Brand :" +brand);
    }
}
