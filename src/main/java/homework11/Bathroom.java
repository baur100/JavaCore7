package homework11;

public class Bathroom extends Room {
    private int sinkNumber;
    private String washingUtility;

    public Bathroom(int area, String color, int windows, int sinkNumber, String washingUtility) {
        super(area, color, windows);
    }

    public int getSinkNumber() {
        return sinkNumber;
    }

    public String getWashingUtility() {
        return washingUtility;
    }
}
