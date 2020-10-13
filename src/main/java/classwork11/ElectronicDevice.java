package classwork11;

import lesson11.ElectricDevice;

public class ElectronicDevice extends ElectricDevice {
    protected String electronic;

    public ElectronicDevice(String deviceName, String electricity, String electronic) {
        super(deviceName, electricity);
        this.electronic = electronic;
    }
}
