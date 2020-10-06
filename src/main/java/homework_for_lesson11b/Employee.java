package homework_for_lesson11b;

public class Employee extends Person{
    private int id;
    private String position;

    public Employee(String name, String lastName, String occupation, int yearExperience, int id, String position) {
        super(name, lastName, occupation, yearExperience);
        this.id = id;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
