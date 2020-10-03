package lesson8;

public class Cat {
    public String name;
    public int age;
    public int weight;
    public String color;


    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
    public void run() {
        System.out.println(name + " is running.");
    }
    public void play() {
        System.out.println(name + " is playing.");
    }

    public String getCatInfo() {
        return name + " " + age + " " + weight + " " + color;

    }
}
