package homework11;

public class Destination extends  Countries{
    protected int price;
    protected int daysOfStay;

    public Destination(String name, int population, String language, String religion) {
        super(name, population, language, religion);

        this.daysOfStay=daysOfStay;
        this.price=price;
    }
}
