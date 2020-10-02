package Homework_3;

public class Car {
    public String name;
    public String make;
    public String model;
    public String year;
    public String owner;

    public void introduce(){
        System.out.println("Hello! I am" + " " + owner +
                " " + name);
        System.out.println("My name is" + " " + make +
                " " + model);
        System.out.println("I was made in" + " " + year);

    }

}
