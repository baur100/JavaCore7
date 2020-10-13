package classwork11;

public class Student extends Person{

    private String major;
    private String[] subjects;

    public Student(String name, String lastName, String gender, int year, String major, String[] subjects) {
        super(name, lastName, gender, year);

        this.major = major;
        this.subjects = subjects;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
}
