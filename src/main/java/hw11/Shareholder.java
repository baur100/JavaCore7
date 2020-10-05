package hw11;

public class Shareholder extends Person{
    private int id;
    private double percentage;

    public Shareholder(String name, String lastName, char gender, String date, int id, double percentage) {
        super(name, lastName, gender, date);
        this.id = id;
        this.percentage = percentage;
    }

    public int getId() {
        return id;
    }

    public double getPercentage() {
        return percentage;
    }
}
