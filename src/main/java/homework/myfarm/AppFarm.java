package homework.myfarm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppFarm {
    public static void main (String [] args) {

        Map<Cattle, Integer> cattle = new HashMap<>();
          cattle.put(Cattle.CHICKENS, 50);
          cattle.put (Cattle.COWS, 12);
          cattle.put(Cattle.PIGS, 22);
          cattle.put(Cattle.SHEEPS,18);
          cattle.put(Cattle.TURKEYS, 25);

        List<Agricultural>agriculturals = new ArrayList<>();
            agriculturals.add(new Agricultural("wheet", 2));
            agriculturals.add(new Agricultural("pea", 1));
            agriculturals.add(new Agricultural("oat", 3));



        Farm myFarm = new Farm("Zarya", new Address("10 Chapaev street", "Rassvet", "AK", 99501), cattle, agriculturals);

        myFarm.printInfo();

    }
}
