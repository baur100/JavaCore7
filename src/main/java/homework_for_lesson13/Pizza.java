package homework_for_lesson13;

import java.util.Arrays;

public class Pizza {
    private String name;
    private Size size [];

    public Pizza(String name, Size[] size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size[] getSize() {
        return size;
    }

    public void setSize(Size[] size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + Arrays.toString(size) +
                '}';
    }
}
