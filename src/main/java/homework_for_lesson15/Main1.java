package homework_for_lesson15;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        Map<Integer,String> country = new HashMap<>();

        country.put(1,"Norway");
        country.put(3,"Denmark");
        country.put(2,"Switzerland");
        country.put(4,"Netherlands");
        System.out.println(country);

        country.put(4,"Austria");
        System.out.println(country);

        country.put(5,"Austria");
        System.out.println(country);

        boolean xx = country.containsValue("Norway");
        System.out.println(xx);

        country.remove(3);
        System.out.println(country);


        System.out.println(country.get(1));

        country.replace(5,"Sweden");
        System.out.println(country);

        System.out.println(country.size());

        country.replace(2,"Switzerland","France");
        System.out.println(country);

        for(Map.Entry<Integer,String>pair:country.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
              }
        System.out.println("*******************************************************************************************************");
        for(Integer key:country.keySet()){
            System.out.println(key);
        }
        System.out.println("*******************************************************************************************************");

       for(String value:country.values()){
           System.out.println(value);
       }
    }
}
