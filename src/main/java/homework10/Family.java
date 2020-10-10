package homework10;

public class Family {


    private String name;
    private String lastName;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;


    }

    public void info() {
        System.out.println("My name is " + name + " " + " " + lastName + " " + "and my age is " + age);


    }


}