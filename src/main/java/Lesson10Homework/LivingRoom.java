package Lesson10Homework;

public class LivingRoom {

    private String type;
    private String brand;
    private int cost;



    public LivingRoom ( String type, String brand , int cost) { //full constructor
        this.type = type ;
        this.brand = brand;
        this.cost = cost;
    }


    public LivingRoom () {    //default constructor always empty
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    public void printLivingRoom(){
        System.out.println("type : " + type + "\n Brand: "+ brand + "\n Cost :" +cost);
    }
}
