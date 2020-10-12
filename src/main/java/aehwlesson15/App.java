package aehwlesson15;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> direction = new HashMap<>();
        direction.put("N", "north");
        direction.put("S", "south");
        direction.put("E", "east");
        direction.put("W", "west");

        System.out.println(direction);

        System.out.println(direction.containsKey("S"));
        System.out.println(direction.containsKey("O"));

        direction.replace("W","west","West");
        System.out.println(direction);

        System.out.println(direction.get("S"));

        for(Map.Entry<String, String> d : direction.entrySet()){
            System.out.println(d.getKey() + " "+ d.getValue());
        }

    }
}
