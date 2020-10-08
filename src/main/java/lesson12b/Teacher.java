package lesson12b;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String lastName, String subject) {
        super(name, lastName);
        this.subject = subject;
    }
}
