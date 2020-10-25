package Tickets1;

public class Tickets {

    private double basePrice;
     private int age;

    public Tickets(double basePrice, int age) {
        this.basePrice = basePrice;
        this.age = age;

    }
    public double getPrice(){
    if(age <=2)
        return 0;
    if(age<=12)
        return basePrice * 0.5;
    if (age>65)
        return basePrice * 0.8;
    return basePrice;


    }
}
