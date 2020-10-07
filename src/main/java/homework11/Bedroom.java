package homework11;

public class Bedroom extends Room{
    private int sleepNumber;

    public Bedroom(int area, String color, int windows, int sleepNumber) {
        super(area, color, windows);
        this.sleepNumber = sleepNumber;
    }

    public int getSleepNumber() {
        return sleepNumber;
    }
}
