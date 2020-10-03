package lesson11;

public class ElectronicDevice extends ElectricDevice{
    protected String electronic;

    public ElectronicDevice(String deviceName, String electricity, String electronic) {
        super(deviceName, electricity);
        this.electronic = electronic;
    }
}
