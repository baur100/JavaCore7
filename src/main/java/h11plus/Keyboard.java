package h11plus;

public class Keyboard {
    private boolean isWireless;
    private String brand;
    private String model;

    public Keyboard(boolean isWireless, String brand, String model) {
        this.isWireless = isWireless;
        this.brand = brand;
        this.model = model;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public void printKeyboard(){
        System.out.println(model+brand+isWireless);
    }
}
