package notes16;

public class Person {
    private String name;
    private int age;
    //age needs borders. no one lives 400 yrs

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age<0){
            throw new IllegalArgumentException("Passed age is negative");
        }
        this.age = age;
    }
}
