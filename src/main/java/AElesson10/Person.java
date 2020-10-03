package AElesson10;

public class Person {

    // All fields in the class should be private due to encapsulation rule
//    We use setters and getters to use fields

    private String name;
    private String lastName;
    private int year;

    public void setName(String n){
        name=n;
    }

    public String getName(){
        return name;
    }

    public void setlastName(String lastName){
        this.lastName=lastName;
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

    // We can to not set getter, if the info is private and should not be able to get it
//    public int getYear() {
//        return year;
//    }
}
