package aelesson11b;

public class App {
    public static void main(String[] args) {

        // Objects can be used as fields for another objects

        Address myAddress = new Address("123 Elm street", "Paterson", "NJ", 88774);
        Person me = new Person("James", "Morris", "M", 2001, myAddress);

        // String is a class
        String str = new String("Hello World");

        String myStreetAddress = me.getAddress().getStreet();
        System.out.println(myStreetAddress);


    }
}
