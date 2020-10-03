package aelesson11;

public class Computer extends ElectronicDevice{
    protected String processor;
    protected String memory;
    protected String storage;

    public Computer(String devicename, String electricity, String electronic, String processor, String memory, String storage) {
        super(devicename, electricity, electronic);
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }
}
