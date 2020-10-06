package homework_for_lesson_12b;

public class Human implements Read {
    private String name;
    private String type;

    public Human(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void read() {
        System.out.println("I am" +    " " + name + " " + "and I am like to read" + " " + type + ".");
    }
}
