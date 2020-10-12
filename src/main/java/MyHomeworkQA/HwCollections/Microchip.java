package MyHomeworkQA.HwCollections;

public class Microchip {

    private String serialNumber;
    private boolean activated;

    public Microchip(String serialNumber, boolean activated) {
        this.serialNumber = serialNumber;
        this.activated = activated;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
