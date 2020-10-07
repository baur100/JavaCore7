package lesson9;

public class Student {
    private String name;
    private String lastname;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String name, String lastname, int age, String gender){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public void print() {
        System.out.println("Name: " + name +
                '\'' + " age: " + age +
                '\'' + " lastname: " + lastname +
                '\'' + " gender: " + gender + '\'');
    }


}
