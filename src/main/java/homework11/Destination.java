package homework11;

public class Destination extends  Countries{
    protected int price;
    protected int daysOfStay;

    public Destination(String name, int population, String language, String religion, int price, int daysOfStay) {
        super(name, population, language, religion);

        this.daysOfStay = daysOfStay;
        this.price = price;

    }
        public void confirmation() {
        System.out.println("Your ticket price is " + " "  + price + " "  +  "You are staying " + " " + daysOfStay + " " + "days.");
    }



    }
