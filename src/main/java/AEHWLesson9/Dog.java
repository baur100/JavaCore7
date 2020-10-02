package AEHWLesson9;

public class Dog {
    public String name;
    public String breed;
    public String color;
    public int age;
    public boolean adapted;

    public void isAdapted(){
        System.out.println("Is " + color + " " + breed + " adapted? - " + adapted);
    }
}
