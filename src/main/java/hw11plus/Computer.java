package hw11plus;

public class Computer {
    private Motherboard mb;
    private Processor cpu;
    private Memory memory;
    private GraphicCard gpu;
    private Storage storage;

    public Computer(Motherboard mb, Processor cpu, Memory memory, GraphicCard gpu, Storage storage) {
        this.mb = mb;
        this.cpu = cpu;
        this.memory = memory;
        this.gpu = gpu;
        this.storage = storage;
    }

    public Motherboard getMb() {
        return mb;
    }

    public Processor getCpu() {
        return cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public GraphicCard getGpu() {
        return gpu;
    }

    public Storage getStorage() {
        return storage;
    }
}
