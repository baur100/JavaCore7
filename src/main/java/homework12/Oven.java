package homework12;

public class Oven implements HasManual{
    public String brand;
    public int price;

    public Oven(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String getInstructions() {
        return "Bake dishes";
    }
}
