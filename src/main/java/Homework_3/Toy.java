package Homework_3;

public class Toy {
    public String name;
    public String type;
    public String size;
    public String owner;

    public void introduce(){
        System.out.println("Hello! My name is" + " " + name);
        System.out.println("I am" + " " + owner + " " + "toy");
    }
    public String toyInfo(){
        return name + " " + type;
    }
    }

