package classwork10;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setYear(int year) throws Exception {
        if (year > 2020 || year < 1900){
            throw new Exception("Wrong year");
        }
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
