package homework10;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private String color;

    public Cat(){

    }

    public Cat(String name, String breed, int age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void printInfo() {
        System.out.println("It's " + name + "!");
    }

    public String getCatInfo(){
        return name + " is a " + age
                + " year(s) old " + color + " " + breed + ".";
    }
}
