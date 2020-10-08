package hw12;

public class WashingMachine implements StartButton {
    private String brand;
    private String model;
    private int price;

    public WashingMachine(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void keepingSizeAndStandard() {
        System.out.println("I use a push button start for the washer");
    }


}
