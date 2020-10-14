package hw16farm;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address farmAddress = new Address("123 Main St", "Mentor", "Ohio", 44060);
        List<AgreeCultural> agreeCultural = new ArrayList<>();
        agreeCultural.add(new AgreeCultural("Wheat", 1));
        agreeCultural.add(new AgreeCultural("Soya", 2));
        agreeCultural.add(new AgreeCultural("Pea", 3));


        Map<Cattle, Integer> cattle = new HashMap<>();
        cattle.put(Cattle.COWS, 4);
        cattle.put(Cattle.SHEEP, 3);
        cattle.put(Cattle.PIGS, 4);
        cattle.put(Cattle.CHICKENS, 5);
        cattle.put(Cattle.TURKEYS, 6);
        cattle.put(Cattle.HORSES,2);


        System.out.println(cattle);

        Farm bakerFarm = new Farm("Baker", farmAddress, cattle, agreeCultural);

        System.out.println(bakerFarm.toString());


//        Hospital universityHosp = new Hospital("UniversityHospital", hospAddress, doctors, rooms, insurance);
//        System.out.println(universityHosp);

    }
}
