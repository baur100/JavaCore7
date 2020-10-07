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
}
