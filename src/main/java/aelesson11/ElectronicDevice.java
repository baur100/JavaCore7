package aelesson11;

public class ElectronicDevice extends ElectricDevice{
    protected String electronic;

    public ElectronicDevice(String devicename, String electricity, String electronic) {
        super(devicename, electricity);
        this.electronic = electronic;
    }
}
