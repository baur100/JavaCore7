package hw11;

public class Person {
    protected String name;
    protected String lastName;
    protected char gender;
    protected String date;

    public Person(String name, String lastName, char gender, String date) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.date = date;
    }

    public String getName() { return name; }

    public String getLastName() { return lastName; }

    public char getGender() { return gender; }

    public String getDate() { return date; }

}
