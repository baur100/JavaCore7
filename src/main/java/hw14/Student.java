package hw14;

public class Student {
    protected String name;
    protected String lastName;
    protected String gender;
    protected int year;

    public Student(String name, String lastName, String gender, int year) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.year = year;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
