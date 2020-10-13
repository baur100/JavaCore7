package homework15;

import java.util.HashMap;
import java.util.Map;

public class App151 {
    public static void main(String[] args) {
        Map<Integer, String> animals = new HashMap<>();

        animals.put(0, "wolf");
        animals.put(1, "tiger");
        animals.put(2, "monkey");
        animals.put(3, "bunny");

        System.out.println(animals);

        System.out.println(animals.get(1));

        animals.remove(0);
        System.out.println(animals);

        animals.replace(1, "lion");
        System.out.println();

        for (Map.Entry<Integer, String> pair: animals.entrySet()) {
            System.out.format("key: %d , value: %s ", pair.getKey(), pair.getValue());
        }
    }
}
