package aelesson16;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("Passed age is negavite");
        }
        this.age = age;
    }
}
