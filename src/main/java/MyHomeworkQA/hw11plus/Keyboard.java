package MyHomeworkQA.hw11plus;

public class Keyboard {

    private String brand;
    private boolean isWireless;

    public Keyboard(String brand, boolean wireless){
        this.brand = brand;
        this.isWireless = wireless;
    }

    public String showInfo(){
        return "Keyboard - Brand: "+brand+", Wireless: "+isWireless;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
}
