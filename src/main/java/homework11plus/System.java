package homework11plus;

public class System {
    private Motherboard motherboard;
    private Processor processor;
    private Storage storage;
    private Memory memory;
    private Powersupply powersupply;

    public System(Motherboard motherboard, Processor processor, Storage storage, Memory memory, Powersupply powersupply) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.storage = storage;
        this.memory = memory;
        this.powersupply = powersupply;
    }

    public System(){

    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Powersupply getPowersupply() {
        return powersupply;
    }

    public void setPowersupply(Powersupply powersupply) {
        this.powersupply = powersupply;
    }
}
