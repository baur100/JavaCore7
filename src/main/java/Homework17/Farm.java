package Homework17;

import MyHomeworkForToday.InsuranceCompanies;
import again.Doctors;
import again.Position;

import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private List <AgraCulture> agreeCultures;
    private Map <Cattle, Integer> cattle;

    public Farm(String name, Address address, List<AgraCulture> agreeCultures, Map<Cattle, Integer> cattle) {
        this.name = name;
        this.address = address;
        this.agreeCultures = agreeCultures;
        this.cattle = cattle;


    }

    public void printFarm() {
        System.out.println(name +  " " + address);

        for (AgraCulture a : agreeCultures) {
            System.out.println(a.toString());
        }
        for (Cattle x : cattle.keySet()) {
            System.out.println(cattle);
        }
    }



    }


