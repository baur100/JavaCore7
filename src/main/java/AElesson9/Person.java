package AElesson9;

//Person is new type created within class with fields
public class Person {
    public String name;
    public String lastName;
    public int year;
    public String gender;


//Function within class named methods
    public void introduce (){
        System.out.println("Hello, my name is " + name + " " + lastName);
    }

    public String getPersonInfo(){
        return name+ " "+ lastName+ " "+year+ " "+ gender;
    }
}
