package MyHomeworkQA.HwFarm;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Farm {

    private String name;
    private Address address;
    private Map<Cattle, Integer> cattleMap = new HashMap<>();
    private List<Agricultural> agriculturalList = new ArrayList<>();


    public Farm(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String printInfo() {
        return "\nFarm Name: " + name + "\n"
                + "Farm Address: " + address.toString() + "\n=========================================\n"
                + "Livestock Count: " + cattleMap.toString() + "\n-----------------------------------------\n"
                + "Crop Count: " + agriculturalList.toString();
    }

    public void addCattleToFarm(Cattle lstock, Integer count) {
        cattleMap.put(lstock, count);
    }

    public void addCropToFarm(Agricultural agric) {
        agriculturalList.add(agric);
    }

}
