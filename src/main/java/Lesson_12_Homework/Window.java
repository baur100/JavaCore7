package Lesson_12_Homework;

public class Window {
    private String name;
    private String color;
    private String tint;

    public Window(String name, String color, String tint) {
        this.name = name;
        this.color = color;
        this.tint = tint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTint() {
        return tint;
    }

    public void setTint(String tint) {
        this.tint = tint;
    }
}
