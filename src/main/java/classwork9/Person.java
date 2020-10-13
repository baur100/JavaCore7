package classwork9;

public class Person {
    public String name;
    public String lastName;
    public int yearOfBirth;
    public String gender;

    public void intro(){
        System.out.println("Hello, my name is " + name + " " + lastName);
    }

    public String getPersonInfo(){
        return  name+" "+lastName+" "+yearOfBirth+" "+gender;
    }

}
