package homework_for_lesson15;

public class Students {
   private String name;

    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student:" + name ;
    }
}
