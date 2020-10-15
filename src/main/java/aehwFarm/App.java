package aehwFarm;


import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Address myAddress = new Address("123 Main Street", "Napa", "CA", 94000);

        HashMap<Cattle,Integer> myCattle = new HashMap<>();
        myCattle.put(Cattle.HORSES, 10);
        myCattle.put(Cattle.BUNNIES, 40);
        myCattle.put(Cattle.PIGS, 15);

        Agriculture myCrop1 = new Agriculture("Corn", 2);
        Agriculture myCrop2 = new Agriculture("Wheat", 1);
        Agriculture myCrop3 = new Agriculture("Potatoes", 3);

        ArrayList<Agriculture> myCrops = new ArrayList<>();
        myCrops.add(myCrop1);
        myCrops.add(myCrop2);
        myCrops.add(myCrop3);

        String myName = "My Farm";

        Farm myFarm = new Farm(myName, myAddress, myCattle, myCrops);

        System.out.println(myFarm.toString());

    }
}
