package h11plus;

public class SystemBlock {
    private String motherboard;
    private String processor;
    private int hdd;
    private int memory;
    private int videocard;

    public SystemBlock(String motherboard, String processor, int hdd, int memory, int videocard) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.hdd = hdd;
        this.memory = memory;
        this.videocard = videocard;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getProcessor() {
        return processor;
    }

    public int getHdd() {
        return hdd;
    }

    public int getMemory() {
        return memory;
    }

    public int getVideocard() {
        return videocard;
    }

    @Override
    public String toString() {
        return "\n************" +
                "\nSystemBlock: " +
                "\nmotherboard= " + motherboard  +
                "\nprocessor= " + processor  +
                "\nhdd= " + hdd +
                "\nmemory= " + memory +
                "\nvideocard=  " + videocard;
    }
}
