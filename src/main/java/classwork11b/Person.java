package classwork11b;

import lesson11b.Address;

public class Person {
    protected String name;
    protected String lastName;
    protected String gender;
    protected int year;
    protected lesson11b.Address address;

    public Person(String name, String lastName, String gender, int year, lesson11b.Address address) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.year = year;
        this.address = address;
    }

    public Person(String vlad, String vainel, String m, int year, classwork11b.Address myAddress) {
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
