package Lesson_15b_HW;

//Create 2 Enums
//Create 2 classes
//- first will have field with type enum
//- second - field as ArrayList<enum.type>

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("1202 Coit Rd", "Dallas", "TX", 75024);

        List<BoysToys> boysToys = new ArrayList<>();
        boysToys.add(BoysToys.CARS);
        boysToys.add(BoysToys.ROBOTS);
        boysToys.add(BoysToys.CONSTRUCTORS);
        boysToys.add(BoysToys.SOLDIERS);

        List<GirlsToys> girlsToys = new ArrayList<>();
        girlsToys.add(GirlsToys.DOLLS);
        girlsToys.add(GirlsToys.HOUSES);
        girlsToys.add(GirlsToys.KITCHEN);
        girlsToys.add(GirlsToys.DRESSES);

        Store store = new Store("Gill", "ToyStore", address);

    }
}
