package HW9;

public class Dog {
    public String name;
    public String breed;
    public String color;
    public int age;

    public void lovely() {
        System.out.println(name + " i like this name!!!");
    }

    public void conformity() {
        System.out.println(age + " This dog is not too old !!!");

    }

    //for example only
    public String getPersonInfo() {
        return //"My dog is " + name + " " + breed + " " + age + " " + color;
                "\tName -> " + name + "\n\tBreed -> " +
                        breed + "\n\tYear -> " + age + "\n\tEye Color -> " + color;

    }
}
