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

        AgreeCultural agreeCultural = new AgreeCultural("Subsistence");

        nameOfCulture nameOfCulture1 = new nameOfCulture("Wheet");
        nameOfCulture nameOfCulture2 = new nameOfCulture("Soya");
        nameOfCulture nameOfCulture3 = new nameOfCulture("Pea");
        List<nameOfCulture> nameOfCultures = new ArrayList<>();
        nameOfCultures.add(nameOfCulture1);
        nameOfCultures.add(nameOfCulture2);
        nameOfCultures.add(nameOfCulture3);

        fieldsNumber fieldsNumber1 = new fieldsNumber(1);
        fieldsNumber fieldsNumber2 = new fieldsNumber(2);
        fieldsNumber fieldsNumber3 = new fieldsNumber(3);

        Farm farm = new Farm("Chico", address, agreeCultural, cattleIntegerHashMap);


    }
}
