package homework_for_lesson11c;

public class Classic extends Music {
    private String city;

    public Classic(String name, int age, String city) {
        super(name, age);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void sing() {
        System.out.println("My name is" + " " + name + ".I am " + " " + age + " " + "old. I'm from" +
                " " + city + ".I prefer classical music" );

    }
}
