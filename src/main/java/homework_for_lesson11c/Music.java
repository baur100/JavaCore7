package homework_for_lesson11c;

public class Music {
    protected String name;
    protected int  age;

    public Music(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sing(){
        System.out.println("My name is" + " " + name + ".I am " + " " + age + " " + "old. I like any music.");
    }
}
