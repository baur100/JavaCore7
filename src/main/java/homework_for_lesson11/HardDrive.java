package homework_for_lesson11;

import java.util.Arrays;

public class HardDrive {
    private String cables;
    private String type;
    private int capacity;
    private int performance;

    public HardDrive(String cables, String type, int capacity, int performance) {
        this.cables = cables;
        this.type = type;
        this.capacity = capacity;
        this.performance = performance;
    }

    public String getCables() {
        return cables;
    }

    public void setCables(String cables) {
        this.cables = cables;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "cables='" + cables + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", performance=" + performance +
                '}';
    }
}

