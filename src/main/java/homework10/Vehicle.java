package homework10;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double mpg;

    public Vehicle(){

    }

    public Vehicle(String brand, String model, int year, double mpg){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mpg = mpg;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getMpg(double mpg){
        return mpg;
    }

    public void setMpg(double mpg){
        this.mpg = mpg;
    }

    public void printInfo() {
        System.out.println("That is a " + model + ".");
    }

    public String pullVehicleInto(){
        return year + " " + brand + " " + model
                + " has " + mpg + " MPG rating.";
    }
}
