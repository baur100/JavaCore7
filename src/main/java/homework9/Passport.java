package homework9;

public class Passport {
    public String firstName;
    public String lastName;
    public int yearOfBirth;
    public String nationality;
    public String placeOfBirth;

    public String getPersonInfo() {
        return firstName + " " + lastName + " " + yearOfBirth + " " + nationality + " " + placeOfBirth;

    }
}