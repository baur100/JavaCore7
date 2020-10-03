package homework9;

public class Employee {
    public String firstName;
    public String lastName;
    public int yearJoined;
    public boolean currentEmplyee;

    public void introdue(){
        System.out.println("Hi, this is " + firstName + " "
                + lastName + " speaking.");
    }

    public String getEmployeeInfo(){
        return firstName + " " + lastName + ", joined in "
                + yearJoined + ", " + "currently working? " + currentEmplyee + ".";
    }
}
