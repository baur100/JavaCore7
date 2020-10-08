package aehwlesson11;

public class SystemBlock {
    protected String processor;

    public SystemBlock(String processor) {
        this.processor = processor;
    }

    public SystemBlock() {
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "SystemBlock: " +
                "processor = " + processor;
    }
}
