package h11plus;

public class Memory {
    private int size;

    public Memory(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "size=" + size +
                '}';
    }
}
