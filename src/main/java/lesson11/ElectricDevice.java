package lesson11;

public class ElectricDevice extends Device{
    protected String electricity;

    public ElectricDevice(String deviceName, String electricity) {
        super(deviceName);
        this.electricity = electricity;
    }
}
