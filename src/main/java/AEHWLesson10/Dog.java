package AEHWLesson10;

public class Dog {
    private String name;
    private String breed;
    private String color;
    private int age;
    private boolean adapted;

    public Dog (){}

    public Dog (String name, String  breed, String color, int age, boolean adapted){
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.adapted = adapted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void dogAge () {
        System.out.println(name + " is " + age + " years old.");
    }

    public void isAdapted(){
        System.out.println("Is " + color + " " + breed + " adapted? - " + adapted);
    }
}
