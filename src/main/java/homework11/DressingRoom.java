package homework11;

public class DressingRoom extends Room {
    private int shelvesNumber;

    public DressingRoom(int area, String color, int windows, int shelvesNumber) {
        super(area, color, windows);
        this.shelvesNumber = shelvesNumber;
    }

    public int getShelvesNumber() {
        return shelvesNumber;
    }
    public String getDescription() {
        return "Dressingroom:" + " area_sq_m:" + area_sq_m + " color: " + color + " windows:" + windows + " shelves:" + shelvesNumber + "\n**************";
    }
}
