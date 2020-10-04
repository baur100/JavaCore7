package hw10;

public class Grocery {
    private String name;
    private boolean available;
    private double price;

    public Grocery() {}

    public Grocery(String name, boolean available, double price) {
        this.name = name;
        this.available = available;
        this.price = price;
    }
    public void setAvailable(boolean tOrF) {
        this.available = tOrF;
    }
    public String getName() {
        return this.name;
    }
    public boolean getAvailable() {
        return this.available;
    }
    public double getPrice() {
        return this.price;
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public void printInfo() {
        System.out.println("Grocery: " +
                "\nName: " + name +
                "\nAvailable: " + available +
                "\nprice: " + price);
    }
}
