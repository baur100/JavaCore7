package classwork11b;

import classwork11.Computer;

public class Work1 {
    public static void main(String[] args) {
        Address myAddress = new Address("7026 Captiva cir", "New Port Richey", "FL", 34655);
        Person me = new Person("Vlad", "Vainel", "M", 1988, myAddress);

        String myStreetAddress = me.getAddress().getStreet();
        System.out.println(myStreetAddress);


    }
}
