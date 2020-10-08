package homework11;

public class Bathroom extends Room {
    private int sinkNumber;
    private String washingUtility;

    public Bathroom(int area, String color, int windows, int sinkNumber, String washingUtility) {
        super(area, color, windows);
        this.sinkNumber = sinkNumber;
        this.washingUtility = washingUtility;
    }

    public int getSinkNumber() {
        return sinkNumber;
    }

    public String getWashingUtility() {
        return washingUtility;
    }

    public String getDescription() {
        return "Bathroom:"+" area_sq_m:"+area_sq_m+" color: "+color+" windows:"+windows+" sinks:"+sinkNumber+" washing utility:"+washingUtility+"\n***********************";
    }
}
