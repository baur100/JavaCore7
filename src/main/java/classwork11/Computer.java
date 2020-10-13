package classwork11;

import lesson11.ElectronicDevice;

public class Computer extends ElectronicDevice {
    protected String proccessor;
    protected String memory;
    protected String storage;

    public Computer(String deviceName, String electricity, String electronic, String proccessor, String memory, String storage) {
        super(deviceName, electricity, electronic);
        this.proccessor = proccessor;
        this.memory = memory;
        this.storage = storage;
    }
}
