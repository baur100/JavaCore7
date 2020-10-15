package hwk14and15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        //Create a class Farm
        //fields
        //private String name;
        //private Address address;
        //private Map<Cattle,Integer> cattle; (Cattle - enum - Cattle.COWS,     Cattle.SHEEPS, Cattle.PIGS, Cattle.CHICKENS, Cattle.TURKEYS... Value    - Integer - number of animals of each kind)
        //private List<AgreeCultural> agreeCultural; (AgreeCultural - class
        //    private String nameOfCulture; Wheet, Soya, Pea
        //    private int fielsNumber;
        //method printInfo() - print out all info

        Address farmAddress = new Address("123 Farm Street", "Farmland", "CA", 900000);

        Map<Cattle,Integer> myCattle = new HashMap<>();
        myCattle.put(Cattle.COWS,100);
        myCattle.put(Cattle.SHEEPS, 87);

        List<AgreeCultural> agreeCultural = new ArrayList<>();
        agreeCultural.add(new AgreeCultural("weat",3));


        Farm myFirstFarm = new Farm("Nice Farm",farmAddress,myCattle, agreeCultural );
        System.out.println(myFirstFarm);
    }
}
