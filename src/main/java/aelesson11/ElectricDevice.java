package aelesson11;

public class ElectricDevice extends Device{
    protected String electricity;

    public ElectricDevice(String devicename, String electricity) {
        super(devicename);
        this.electricity = electricity;
    }
}
