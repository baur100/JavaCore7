package hw15;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address address = new Address("1122 Vanoween","Fresno","CA",82222);
        Map<Cattle,Integer> cattleNumber = new HashMap<>();
        cattleNumber.put (Cattle.CHICKENS,5);
        cattleNumber.put (Cattle.COWS,10);
        cattleNumber.put (Cattle.TURKEYS,10);
        cattleNumber.put (Cattle.SHEEPS,10);

        List<AgreeCulture1> agreeCulture1s = new ArrayList<>();
        agreeCulture1s.add(new AgreeCulture1("SOY",3));
        agreeCulture1s.add(new AgreeCulture1("WHEAT",2));
        agreeCulture1s.add(new AgreeCulture1("BUCKWHEAT",1));


        Farm Farm1 = new Farm("HappyFarm",address,cattleNumber,agreeCulture1s);
        System.out.println(Farm1.toString());

    }
}
