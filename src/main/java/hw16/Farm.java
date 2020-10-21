package hw16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle, Integer> cattle = new HashMap<>();
    private List<Agricultural> agricultural = new ArrayList<>();

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<Agricultural> agricultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agricultural = agricultural;
    }

    public void printInfo() {
        System.out.println("Farm's name: " + this.name);
        System.out.println("\t Address: " + this.address);
        System.out.println("\t Cattle: ");
        for (Map.Entry<Cattle, Integer> entry : cattle.entrySet()) {
            Cattle key = entry.getKey();
            int value = entry.getValue();
            System.out.println("\t\t - " + value + " " + key);
        }
        System.out.println("\t Agricultural: ");
        for (Agricultural v : agricultural) {
            System.out.println("\t\t - " + v);
        }
    }
}
//      Create a class Farm
//      fields
//      private String name;
//      private Address address;
//      private Map<Cattle,Integer> cattle; (Cattle - enum - Cattle.COWS,     Cattle.SHEEPS, Cattle.PIGS, Cattle.CHICKENS, Cattle.TURKEYS... Value    - Integer - number of animals of each kind)
//      private List<AgreeCultural> agreeCultural; (AgreeCultural - class
//      private String nameOfCulture; Wheat, Soya, Pea
//      private int fieldsNumber;
//      method printInfo() - print out all info
