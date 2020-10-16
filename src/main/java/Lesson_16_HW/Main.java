package Lesson_16_HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("202 Coit Rd", "Dallas", "TX", 75050);

        HashMap<Cattle, Integer> cattleIntegerHashMap = new HashMap<>();

        cattleIntegerHashMap.put(Cattle.COWS, 1);
        cattleIntegerHashMap.put(Cattle.SHEEPS, 2);
        cattleIntegerHashMap.put(Cattle.PIGS, 3);
        cattleIntegerHashMap.put(Cattle.CHICKENS, 4);
        cattleIntegerHashMap.put(Cattle.TURKEYS, 5);

        List<AgreeCultural> agreeCultural = new ArrayList<>();
        agreeCultural.add(new AgreeCultural ("Subsistence"));
        agreeCultural.add(new AgreeCultural("Nomadic"));
        agreeCultural.add(new AgreeCultural("Shifting"));
        

        Farm farm = new Farm("Chili", address, cattleIntegerHashMap, agreeCultural,
                "nameOfCultures", 2);
        farm.printFarm();

    }
}
