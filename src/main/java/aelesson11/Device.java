package aelesson11;

public class Device {
    protected String deviceName;

    public Device(String devicename) {
        this.deviceName = devicename;
    }

    public String getDevicename() {
        return deviceName;
    }

    public void setDevicename(String devicename) {
        this.deviceName = devicename;
    }
}
