package Lesson17;

public class Perosn {
    private  String name;
    private int age;

    public void setAge(int age) throws IllegalAccessException {
        this.age = age;
        if (age<0) {
            throw new IllegalAccessException("Age Negatove");
        }

        this.age = age;
        }
    }
