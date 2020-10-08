package homework_for_lesson11;

public class Computer {
    private CPU processor;
    private Motherboard motherboard;
    private Memory memory;
    private RAM ram;

    public Computer(CPU processor, Motherboard motherboard, Memory memory, RAM ram) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.memory = memory;
        this.ram = ram;
    }

    public CPU getProcessor() {
        return processor;
    }

    public void setProcessor(CPU processor) {
        this.processor = processor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", motherboard=" + motherboard +
                ", memory=" + memory +
                ", ram=" + ram +
                '}';
    }
}

