package homework_for_lesson_12b;

public class Dog implements Read {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void read() {
        System.out.println("I am a dog" + " " + name + " " + "and I cannot read at all.");
    }
}
