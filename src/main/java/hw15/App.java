package hw15;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<String, String> cars = new HashMap<>();

        cars.put("Honda", "Civic");
        cars.put("Toyota", "Camry");
        cars.put("Buick", "Encore");
        cars.put("Suburu", "Crosstrek");

        System.out.println(cars);

        Map<Integer, Integer> aisleRow = new HashMap<>();
        aisleRow.put(11,3);
        aisleRow.put(1,6);
        aisleRow.put(5,1);
        aisleRow.put(7,10);

        System.out.println(aisleRow);

        aisleRow.replace(7, 14);
        System.out.println(aisleRow);

        aisleRow.remove(7);
        System.out.println(aisleRow);


        for (Integer key: aisleRow.keySet()){
            System.out.println(key);
        }
        for (Integer value : aisleRow.values()){
            System.out.println(value);
        }



        Map<Style, Colors> auto = new HashMap<>();
        auto.put(new Style("Electric"), Colors.BLUE);
        auto.put(new Style("Truck"), Colors.BLACK);
        auto.put(new Style("Cars"), Colors.BLACK);
        auto.put(new Style("SUV"), Colors.GREEN);
        System.out.println(auto.size());

//        auto.forEach(x-> System.out.println(x.getModel() + Colors.BLACK));
//        students.forEach(x-> System.out.println(x.getName() + " " + x.getLastName()));

    }
}
