package homework9;

public class Furniture {
    public String name;
    public String store;
    public String color;
    public String theCountryOfManufacture;
    public int price;

    public String item() {
        return name + " " + color + " " + store + " " + theCountryOfManufacture + " " + price + ".";
    }
    public void ad(){
            System.out.println("This " + color + " " + name + "from " + store + " is the best.");
    }
}
