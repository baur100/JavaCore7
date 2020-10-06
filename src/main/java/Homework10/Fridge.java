package Homework10;

public class Fridge {
    private int Qft;
    private int year;
    private String model;
    private double price;
    private String seller;

    public int getQft() {
        return Qft;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getSeller() {
        return seller;
    }

    public void setQft(int qft) {
        Qft = qft;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) throws Exception{
        if(year<=2020 || year>=1900) {
            throw new Exception("Wrong year");
        }
        this.year = year;
    }

    public void printFridgeinfo(){
        System.out.println("Fridge info"+year+model+price);

    }

}