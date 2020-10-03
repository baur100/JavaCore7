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

    public void setYear(int year){
        
    }
}
