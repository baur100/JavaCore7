package homework11;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected String gender;
    protected int yearJoined;

    public Employee(String firstName, String lastName, String gender, int yearJoined) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.yearJoined = yearJoined;
    }

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

}
