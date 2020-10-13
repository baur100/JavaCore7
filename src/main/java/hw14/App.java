package hw14;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String[] array = new String[5];

        list.add("Honey nut Cheerios");
        list.add("Golden Grahams");
        list.add("Frosted Flakes");
        list.add("Fruit Loops");
        list.add("Cinnamon Life");

        System.out.println(list);

        ArrayList<Integer> order = new ArrayList<Integer>();
        Integer[] array2 = new Integer[5];
        order.add(1);
        order.add(2);
        order.add(3);
        order.add(4);
        order.add(5);

        System.out.println(order);
        order.remove(2);
        System.out.println(order);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Thomas", "Smith", "Male", 2021));
        students.add(new Student("Julie", "Barker", "Female", 2022));
        students.add(new Student("Anne", "Hathaway", "Female", 2021));
        students.add(new Student("Brian", "Marks", "Male", 2020));
        students.add(new Student("Maria", "Rodriguez", "Female", 2022));


//        students.forEach(x-> System.out.println(x.getName() + " " + x.getLastName()));


    }

}
