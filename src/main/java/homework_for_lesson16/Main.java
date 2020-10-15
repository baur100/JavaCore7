package homework_for_lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AgreeCultural> agreeCultural = new ArrayList<>();
        agreeCultural.add(new AgreeCultural("wheet",7));
        agreeCultural.add(new AgreeCultural("soya",4));
        agreeCultural.add(new AgreeCultural("pea",3));

        HashMap<Cattle,Integer> cattle = new HashMap<>();
        cattle.put(Cattle.TURKEYS,5);
        cattle.put(Cattle.SHEEP,12);
        cattle.put(Cattle.PIGS,7);
        cattle.put(Cattle.COWS,4);
        cattle.put(Cattle.CHICKENS,24);

        Address address = new Address("466 Sunstreet","York","AZ",65148);
        Farm farm = new Farm("Happy Animals",address,cattle,agreeCultural);
        System.out.println(farm);

        System.out.println();



    }
}
