package Homework4;

public class Watch {
    private String name;
    private String brand;
    private String color;
    private int price;

    public Watch(String name, String brand, String color, int price) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void printWatchInfo(){

    }

    public Watch() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
