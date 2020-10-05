package main.java.HW.lesson10;

public class Car extends Vehicle {

    private String model;
    private int price;
    private String country;

    public Car(String madeIn, String usage, String color, String model, int price, String country) {
        super(madeIn, usage, color);
        this.model = model;
        this.price = price;
        this.country = country;
    }


    public String getCountry() {
        return country;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public void setCountry(String country) {
        this.country = country;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + "\n model: " + this.model + "\ncountry: " + this.country + "\nprice" + this.price;
    }
}
