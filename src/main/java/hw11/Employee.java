package hw11;

public class Employee extends Person {
    private int id;
    private String position;

    public Employee(String name, String lastName, char gender, String date, int id, String position) {
        super(name, lastName, gender, date);
        this.id = id;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }
}
