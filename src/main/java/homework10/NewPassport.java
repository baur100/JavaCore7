package homework10;

public class NewPassport {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String nationality;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setYearOfBirth(int yearOfBirth) throws Exception {
        if (yearOfBirth > 2020 || yearOfBirth < 1900) {
            throw new Exception("Wrong Age");
        }
        this.yearOfBirth = yearOfBirth;
    }
    public NewPassport (){}

    public NewPassport(String firstName, String lastName, int yearOfBirth, String nationality){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.nationality = nationality;
    }


    public void info() {
        System.out.println("I am " + firstName + " " + lastName + " " + yearOfBirth + " " + nationality);
    }
}