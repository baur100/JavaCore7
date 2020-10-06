package homework_for_lesson11c;

public class Hiphop extends Music{

    private String hobby;

    public Hiphop(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void sing() {
        System.out.println("My name is" + " " + name + ".I am " + " " + age + " " + "old. I prefer" + " " + hobby+".");

    }
}
