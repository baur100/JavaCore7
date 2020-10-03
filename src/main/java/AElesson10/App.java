package AElesson10;

public class App {
    public static void main(String[] args) {
        Person evan = new Person();
        evan.setName("Evan");
        evan.setlastName("White");

        String name = evan.getName();



        House h1 = new House();
        h1.setYear(1999);
        h1.setBathrooms(3);
        h1.setBedrooms(2);
        h1.setAddress("1 Main Street");


    }
}
