package homework_for_lesson15;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> rainbow = new HashMap<>();

        rainbow.put("first color", "red");
        rainbow.put("second color", "orange");
        rainbow.put("third color", "yellow");
        rainbow.put("fourth color", "green");
        rainbow.put("fifth color", "cyan");
        rainbow.put("sixth color", "blue");
        rainbow.put("seventh color", "violet");
        System.out.println(rainbow);

        rainbow.put("first color", "pink");
        System.out.println(rainbow);

        rainbow.put("last color", "pink");
        System.out.println(rainbow);

        rainbow.remove("last color");
        System.out.println(rainbow);

        rainbow.remove("first color", "pink");
        System.out.println(rainbow);

        boolean xx = rainbow.containsKey("last color");
        System.out.println(xx);

        boolean yy = rainbow.containsValue("green");
        System.out.println(yy);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for(String key:rainbow.keySet()){
            System.out.println(key);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

       for(String value:rainbow.values()){
            System.out.println(value);
               }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (Map.Entry<String, String> pair : rainbow.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}

