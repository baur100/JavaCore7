package Homework10;

public class Fridge {
    private int Qft;
    private int year;
    private String model;
    private double price;

    public Fridge(int Qft, int year, String model, double price) {
        this.Qft = Qft;
        this.model=model;
        this.price=price;
        this.year=year;

    }
    public void printFridgeinfo(){
        System.out.println("Fridge info"+year+model+price);

    }

}