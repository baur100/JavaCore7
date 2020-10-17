package lesson12b;

public class Student extends Person {
    private String major;

    public Student(String name, String lastName, String major) {
            super(name, lastName);
            this.major = major;
    }
}
