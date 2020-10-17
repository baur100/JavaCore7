package h11plus;

public class SystemBlock {
    private Motherboard motherboard;
    private Disk disk;
    private Memory memory;
    private Processor cpu;

    public SystemBlock(Motherboard motherboard, Disk disk, Memory memory, Processor cpu) {
        this.motherboard = motherboard;
        this.disk = disk;
        this.memory = memory;
        this.cpu = cpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "SystemBlock{" +
                "motherboard=" + motherboard +
                ", disk=" + disk +
                ", memory=" + memory +
                ", cpu=" + cpu +
                '}';
    }
}
