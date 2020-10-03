package aelesson11b;

public class Person {
    protected String name;
    protected String lastName;
    protected String gender;
    protected int year;
    protected Address address;

    public Person(String name, String lastName, String gender, int year, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.year = year;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getYear() {
        return year;
    }

    public Address getAddress() {
        return address;
    }
}
