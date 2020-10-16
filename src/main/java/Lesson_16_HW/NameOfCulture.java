package Lesson_16_HW;

public class NameOfCulture {
    private String name;

    public NameOfCulture() {
    }

    public NameOfCulture(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String nameOfCultInfo() {
        return "nameOfCulture: + "+ name;
    }
}
