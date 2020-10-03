package aelesson11;

public class Teacher extends Person{
    private String subject;

    public Teacher(String name, String lastName, String gender, int year, String subject) {
        super(name, lastName, gender, year);
        this.subject = subject;
    }

        public String getSubject() {
        return subject;
    }
}
