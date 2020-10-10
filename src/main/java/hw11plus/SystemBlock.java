package hw11plus;

public class SystemBlock {
    private Motherboard motherboard;
    private Disk disk;
    private Cpu processor;

    public SystemBlock(Motherboard motherboard, Disk disk, Cpu processor) {
        this.motherboard = motherboard;
        this.disk = disk;
        this.processor = processor;
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

    public Cpu getProcessor() {
        return processor;
    }

    public void setProcessor(Cpu processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "SystemBlock{" +
                "motherboard=" + motherboard +
                ", disk=" + disk +
                ", processor=" + processor +
                '}';
    }


}
