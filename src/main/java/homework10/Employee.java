package homework10;

public class Employee {
    private String firstName;
    private String lastName;
    private int yearJoined;
    private boolean currentEmployee;

    public Employee() {

    }

    public Employee(String firstName, String lastName, int yearJoined, boolean currentEmployee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearJoined = yearJoined;
        this.currentEmployee = currentEmployee;
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

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public boolean getIsCurrentEmployee(boolean currentEmployee) {
        return currentEmployee;
    }

    public void setIsCurrentEmployee(boolean currentEmployee) {
        this.currentEmployee = currentEmployee;
    }

    public void printInfo() {
        System.out.println(firstName + " " + lastName + " is on file.");
    }

    public String pullEmployeeInfo() {
        return firstName + " " + lastName + " joined in " + yearJoined
                + ". Current employee? " + currentEmployee + ".";
    }
}