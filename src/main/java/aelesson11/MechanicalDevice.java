package aelesson11;

public class MechanicalDevice extends Device{
    protected String gear;

    public MechanicalDevice(String devicename, String gear) {
        super(devicename);
        this.gear = gear;
    }
}
