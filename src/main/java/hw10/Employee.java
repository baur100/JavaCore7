package hw10;

public class Employee {
    private String name;
    private String lastName;
    private int year;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return this.name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setYear(int year) throws Exception {
        if(year>2020 || year<1900){
            throw new Exception("Wrong Age");
        }
        this.year = year;
    }
    public Employee(int year, String name, String lastName){
        this.year = year;
        this.name = name;
        this.lastName = lastName;
            }
    public Employee(){}

    public void printEmployeeInfo(){
        System.out.println(name+" "+lastName+" works here at the library and started in "+year);
                }

//    public static setYear() {
//    }
}
