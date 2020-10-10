package homework11;

public class Salesperson extends Employee{
    private int baseWage;
    private int commission;

    public Salesperson(String firstName, String lastName, String gender, int yearJoined, int baseWage, int commission) {
        super(firstName, lastName, gender, yearJoined);
        this.baseWage = baseWage;
        this.commission = commission;
    }

    public Salesperson(){

    }

    public int getBaseWage() {
        return baseWage;
    }

    public void setBaseWage(int baseWage) {
        this.baseWage = baseWage;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public String getSalespersonInfo() {
        return firstName + " " + lastName + ", " + gender + ", joined in year "
                + yearJoined + ". Base wage and commission: "
                + baseWage + "/" + commission;
    }
}
