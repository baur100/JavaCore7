package classwork11;

import lesson11.Device;

public class ElectricDevice extends Device {
    protected String electricity;

    public ElectricDevice(String deviceName, String electricity) {
        super(deviceName);
        this.electricity = electricity;
    }
}
