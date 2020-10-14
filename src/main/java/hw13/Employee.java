package hw13;

import java.util.Arrays;

public class Employee {
    private String name;
    private int experience;
    private Programming[] programming;

    public Employee(String name, int experience, Programming[] programming) {
        this.name = name;
        this.experience = experience;
        this.programming = programming;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Programming[] getProgramming() {
        return programming;
    }

    public void setProgramming(Programming[] programming) {
        this.programming = programming;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", programming=" + Arrays.toString(programming) +
                '}';
    }
}
