package class9;

public class Person1 {
    public String name;
    public String lastName;
    public int year;
    public String gender;

    public void introduce(){
        System.out.println("Hello, my name is "+name +" "+lastName);
    }

    public String getPersonInfo(){
        return name+" "+lastName+" "+year+" "+gender;
    }
}
