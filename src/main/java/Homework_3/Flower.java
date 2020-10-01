package Homework_3;

        //1. Create 4 classes with fields and methods
        //2. In the App class create main() and create 2 instances of each class, fill all fields
        //invoke methods

public class Flower {
    public String name;
    public String color;
    public String smell;

    public void introduce(){
        System.out.println("Hello, my name is " + name + "");
        System.out.println("And, I smell" + " " + smell);
        }
        public String getFlowerinfo(){
        return name + "" + color + "";

        }

}
