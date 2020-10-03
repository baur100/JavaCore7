package L10;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setYear(int year) throws Exception {
        if (year > 2020 || year < 1900) {
            throw new Exception("Wrong Age");
        }
        this.year = year;
    }
//    public int getYear(){
//        return year;
//    }
}
