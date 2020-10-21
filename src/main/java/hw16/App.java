package hw16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address address = new Address("23 Emmons Str.", "Amsterdam", "NY", 11012);
        Map<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.COWS, 20);
        cattle.put(Cattle.CHICKENS, 100);
        cattle.put(Cattle.TURKEYS, 50);
        List<Agricultural> agricultural = new ArrayList<>();
        agricultural.add(new Agricultural("Wheat", 10));
        agricultural.add(new Agricultural("Corn", 10));

        Farm greenFarm = new Farm("Green Farm", address, cattle, agricultural);

        greenFarm.printInfo();
    }
}
