package tickets;

public class Ticket {
    private double price;
    private int age;

    public Ticket(double price, int age) {
        this.price = price;
        this.age = age;
    }

    public double getPrice() {
        if (age <= 2)
            return 0;
        if (age <= 12)
            return price * 0.5;
        if (age > 65)
            return price * 0.8;
        return price;
    }
}
