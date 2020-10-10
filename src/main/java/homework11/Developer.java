package homework11;

public class Developer extends Employee{
    private double hourlyRate;
    private double overtimeRate;

    public Developer(String firstName, String lastName, String gender, int yearJoined, double hourlyRate, double overtimeRate) {
        super(firstName, lastName, gender, yearJoined);
        this.hourlyRate = hourlyRate;
        this.overtimeRate = overtimeRate;
    }

    public Developer(){
    }

       public double getHourlyRate(){
        return hourlyRate;
    }

    public void setHourlyRate(){
        this.hourlyRate = hourlyRate;
    }

    public double getOvertimeRate(double overtimeRate){
        return overtimeRate;
    }

    public void setOvertimeRate(){
        this.overtimeRate = overtimeRate;
    }

    public String getDeveloperInfo(){
        return firstName + " " + lastName + ", " + gender + ", joined in year "
                + yearJoined + ". Regular/overtime hourly pay: "
                + hourlyRate + "/" + overtimeRate;
    }
}