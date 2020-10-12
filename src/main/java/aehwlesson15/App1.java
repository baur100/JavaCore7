package aehwlesson15;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<Integer,String> direction1 = new HashMap<>();
        direction1.put(1, "north");
        direction1.put(2, "south");
        direction1.put(3, "west");
        direction1.put(4, "east");

        System.out.println(direction1);

        for (int x: direction1.keySet()) {
            System.out.println(x);
        }

        for (String xx: direction1.values()){
            System.out.println(xx);
        }

        for(Map.Entry<Integer, String> zz : direction1.entrySet()){
            System.out.println(zz.getKey() + " " + zz.getValue());
        }
    }
}
