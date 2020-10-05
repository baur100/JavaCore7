package homework9;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public String color;

    public void summonDog() {
    System.out.println("Hey, " + name + "!");
    }

    public String getDogInfo(){
        return name + " is a " + age
                + " year(s) old " + color + " " + breed + ".";
    }
}
