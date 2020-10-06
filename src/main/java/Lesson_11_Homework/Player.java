package Lesson_11_Homework;

public class Player extends Headset{
    private String size;

    public Player(String name, String make, String model, String size) {
        super(name, make, model);
        this.size = size;
    }

    public Player(String player, String apple, String sweet, String[] playerSize) {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
