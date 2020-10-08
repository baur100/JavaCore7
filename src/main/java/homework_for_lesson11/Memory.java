package homework_for_lesson11;

public class Memory {
    private String name;
    private int capacity;

    public Memory(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
