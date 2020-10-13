package classwork11;

import lesson11.Device;

public class MechanicalDevice extends Device {
    protected String gear;

    public MechanicalDevice(String deviceName, String gear) {
        super(deviceName);
        this.gear = gear;
    }
}
