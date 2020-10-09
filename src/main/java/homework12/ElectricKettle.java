package homework12;

public class ElectricKettle implements HasManual {
    private String Model;
    private int price;

    public ElectricKettle(String model, int price) {
        Model = model;
        this.price = price;
    }

    @Override
    public String getInstructions() {
        return "Boil the water";
    }
}
