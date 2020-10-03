package AElesson10;

public class App {
    public static void main(String[] args) throws Exception {
        Person evan = new Person();
        evan.setName("Evan");
        evan.setlastName("White");

        String name = evan.getName();
        evan.setYear(1995);

        Vehicle myMazda = new Vehicle();
        myMazda.setBrand("Mazda");
        myMazda.setModel("CX-6");
        myMazda.setOwner("Me");
        myMazda.setYear(2010);

        myMazda.drive();

        House myHouse = new House (2008, 2, 3, "4 Setter St");
        myHouse.printHouseInfo();

        House h1 = new House();
        h1.setYear(1999);
        h1.setBathrooms(3);
        h1.setBedrooms(2);
        h1.setAddress("1 Main Street");
        h1.printHouseInfo();


    }
}
