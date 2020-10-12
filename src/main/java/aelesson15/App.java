package aelesson15;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        //HashMap
        //HashMap uses key-value pair.
        //Key must be unique, value - not
        Map<String,String> capitals = new HashMap<>();

        capitals.put("England", "London");
        capitals.put("German", "Berlin");
        capitals.put("India", "Delhi");
        capitals.put("Chine", "Benjing");

        //There is no order in HashMap
        System.out.println(capitals);

        //Will replace value Benjing with Pekin for the unique key China
        capitals.put("China", "Pekin");
        System.out.println(capitals);

        //Will allow to put two unique keys UK and England with the sane value London
        capitals.put("UK", "London");
        System.out.println(capitals);

        //Contains
        boolean xx = capitals.containsKey("India");
        System.out.println(xx);
        xx = capitals.containsValue("London");
        System.out.println(xx);


        //Iterate by Key, by Value, by Entryset
        var entry = capitals.entrySet();
        for (String key : capitals.keySet()){
            System.out.println(key);
        }
        for(String value : capitals.values()){
            System.out.println(value);
        }
        for (Map.Entry<String,String> pair : capitals.entrySet()){
            System.out.println(pair.getKey()+ " "+pair.getValue());
        }


        //Key is used as Index
        Map<Integer,String> food = new HashMap<>();
        food.put(0, "Icecream");
        food.put(1, "Fries");
        food.put(2, "Fruits");



        Map<Person, Address> people = new HashMap<>();
        people.put(new Person("Many"), new Address ("123 Maple Street"));

        System.out.println(people.size());

    }
}
