package lesson11;

public class MechanicalDevice extends Device{
    protected String gear;

    public MechanicalDevice(String deviceName, String gear) {
        super(deviceName);
        this.gear = gear;
    }
}
