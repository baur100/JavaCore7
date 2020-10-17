package lesson15;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,String> capitals = new HashMap<>();

        capitals.put("England","London");
        capitals.put("Germany","Berlin");
        capitals.put("India","New Delhi");
        capitals.put("China","Beijing");

        System.out.println(capitals);

        capitals.put("China","Pekin");
        System.out.println(capitals);
        capitals.put("UK","London");
        System.out.println(capitals);

        boolean xx = capitals.containsKey("India");
        System.out.println(xx);
        xx = capitals.containsValue("London");
        System.out.println(xx);

//        for (String key : capitals.keySet()){
//            System.out.println(key);
//        }
//        for (String value : capitals.values()){
//            System.out.println(value);
//        }
        for(Map.Entry<String,String> pair : capitals.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }


        Map<Integer,String> food = new HashMap<>();
        food.put(0,"Icecream");
        food.put(15,"Fries");
        food.put(2,"Fruits");

        Map <Person, Address> people = new HashMap<>();
        people.put(new Person("Many"), new Address("123 Mapleton st"));

        System.out.println(people.size());

    }
}
