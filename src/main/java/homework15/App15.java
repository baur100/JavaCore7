package homework15;

import java.util.HashMap;
import java.util.Map;

public class App15 {
    public static void main(String[] args){
        Map<String, String> subjects = new HashMap<>();

        subjects.put("Mary", "history");
        subjects.put("Bill", "algebra");
        subjects.put("Paul", "georgaphy");
        subjects.put("Vera", "art");

        System.out.println(subjects);

        System.out.println(subjects.get("Vera"));

        subjects.replace("Mary","Spanish");
        System.out.println(subjects);

        subjects.remove("Paul");
        System.out.println(subjects);


        for (Map.Entry<String, String> pair: subjects.entrySet()) {
            System.out.format("key: %s , value: %s ", pair.getKey(), pair.getValue());
        }




        }
}
