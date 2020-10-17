package aetickets;

public class AETickets {
    private double baseFare;
    private int age;

    public AETickets(double baseFare, int age) {
        this.baseFare = baseFare;
        this.age = age;
    }

    public double getPrice(){
        if(age<=2)
            return 0;
        if(age<=12)
            return baseFare*0.5;
        if(age>65)
            return baseFare*0.8;
        return baseFare;
    }
}
