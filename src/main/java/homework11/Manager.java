package homework11;

public class Manager extends Employee {
    private int yearlySalary;
    private int cashDivident;

    public Manager(String firstName, String lastName, String gender, int yearJoined, int yearlySalary, int cashDivident) {
        super(firstName, lastName, gender, yearJoined);
        this.yearlySalary = yearlySalary;
        this.cashDivident = cashDivident;
    }

    public Manager(){

    }

    public int getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(int yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public int getCashDivident() {
        return cashDivident;
    }

    public void setCashDivident(int cashDivident) {
        this.cashDivident = cashDivident;
    }

    public String getManagerInfo() {
        return firstName + " " + lastName + ", " + gender + ", joined in year "
                + yearJoined + ". Yearly salary and Cash divident: "
                + yearlySalary + "/" + cashDivident;
    }
}
