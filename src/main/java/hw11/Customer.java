package hw11;

public class Customer extends Person {
    private int id;

    public Customer(String name, String lastName, char gender, String date, int id) {
        super(name, lastName, gender, date);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
