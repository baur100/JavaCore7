package Homework17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Address address = new Address("1000 Fairweather Drive", "Sacramento", "CA", 95833);


        AgraCulture A1 = new AgraCulture("Wheet", 43);
        AgraCulture A2 = new AgraCulture("Peas", 58);
        AgraCulture A3 = new AgraCulture("Soya", 55);

        List<AgraCulture> agraCultures = new ArrayList<>();
        agraCultures.add(A1);
        agraCultures.add(A2);
        agraCultures.add(A3);

        HashMap<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.SHEEP, 4);
        cattle.put(Cattle.TURKEY, 15);
        cattle.put(Cattle.COWS, 54);
        cattle.put(Cattle.CHICKENS, 45);

        Farm familyFarm = new Farm("Family Farm", address, agraCultures, cattle);

        familyFarm.printFarm();

    }
}



