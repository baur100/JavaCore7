package class10;

public class App {
    public static void main(String[] args) throws Exception {
        Person evan = new Person();
        evan.setName("Evan");
        evan.setName("Eevan");

        String name = evan.getName();
        evan.setYear(1995);

        Vehicle myMazda = new Vehicle();
        myMazda.setBrand("Mazda");
        myMazda.setModel("CX-6");
        myMazda.setOwner("Me");
        myMazda.setYear(2010);

//        myMazda.drive();

        House myHouse = new House(2010,3,2,"122 Maple St.");
//        myHouse.printHouseInfo();

        House myFriendsHouse = new House(4,2,"12 Elm st");
        myFriendsHouse.setYear(1995);
//        myFriendsHouse.printHouseInfo();

        House h1 = new House();
        h1.setYear(1999);
        h1.setAddress("88 Broadway");
        h1.setBathrooms(1);
        h1.setBedrooms(0);
        h1.printHouseInfo();





    }
}
