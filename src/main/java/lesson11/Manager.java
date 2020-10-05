package lesson11;

public class Manager extends Person{
    private String position;

    public Manager(String name, String lastName, String gender, int year, String position) {
        super(name, lastName, gender, year);
        this.position = position;
    }

}
