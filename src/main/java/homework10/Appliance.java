package homework10;

public class Appliance {
    private String type;
    private String brand;
    private String color;
    private int price;

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public Appliance() {}

    public Appliance(String type, String brand, String color, int price) {
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String info() {
        return "This " + type + " from " + brand + " is the best. The price is $" + price;
    }

}
