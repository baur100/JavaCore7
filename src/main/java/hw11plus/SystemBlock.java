package hw11plus;

public class SystemBlock {
    private Motherboard motherboard;
    private Disk disk;
    private Processor cpu;

    public SystemBlock(Motherboard motherboard, Disk disk, Processor cpu) {
        this.motherboard = motherboard;
        this.disk = disk;
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
                ", cpu=" + cpu +
                '}';
    }
}
