package homework_for_lesson15;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<Students, Performance> students = new HashMap<>();

        students.put(new Students("Steve Smith"), new Performance("excellent"));
        students.put(new Students("Sean Blade"), new Performance("not bad"));
        students.put(new Students("Heather Green"), new Performance("excellent"));
        students.put(new Students("Mary Kuri"), new Performance("perfect"));

        //System.out.println(students);

        for (Map.Entry<Students, Performance> pair : students.entrySet()) {
            System.out.println(pair.getKey() + "," + pair.getValue());

        }

    }
}


