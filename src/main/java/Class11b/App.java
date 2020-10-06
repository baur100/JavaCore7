package Class11b;

public class App {
    public static void main(String[] args) {
        Address myAddress = new Address("123 Elm street", "Patterson", "NJ",88774);
        Person me = new Person("James", "Morris", "M", 2001, myAddress);

        String str = new String("Hello World");

        String myStreetAddress = me.getAddress().getStreet();
        System.out.println(myStreetAddress);
    }
}
