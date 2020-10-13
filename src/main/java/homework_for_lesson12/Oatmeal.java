package homework_for_lesson12;

public class Oatmeal implements Food {
    private String name;

    public Oatmeal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void Food() {
        System.out.println("I prefer to eat oatmeal" +" "+ name+" "+"for breakfast.");
    }
}
