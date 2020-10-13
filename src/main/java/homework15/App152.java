package homework15;

import java.util.HashMap;
import java.util.Map;

public class App152 {
    public static void main(String[] args) {
        Map<Student, School> athletes = new HashMap<>();

        Student mary = new Student("Mary");
        athletes.put(mary, new School("UCSF"));

        Student katya = new Student("Katya");
        athletes.put(katya, new School("CalPoly"));
        athletes.put(new Student("Ivan"), new School("UCSD"));
        Student mark = new Student("Mark");
        athletes.put(mark, new School("Stanford"));

        System.out.println(athletes);
        athletes.remove(mark);

        athletes.replace(mary, new School("Harward"));
        System.out.println(athletes);

        System.out.println(athletes.get(katya));

        for (Map.Entry<Student, School> pair: athletes.entrySet()) {
            System.out.format("key: %s , value: %s ", pair.getKey(), pair.getValue());
        }
    }
}
