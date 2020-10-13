package homework14;

import java.util.ArrayList;
import java.util.List;

public class HW14 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("apricot");
        System.out.println(fruits);

        fruits.set(2, "orange");
        System.out.println(fruits);

        fruits.remove(1);
        System.out.println(fruits);


        System.out.println(fruits.get(0));

        fruits.forEach(System.out::println);

        List<Integer>numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(100);
        numbers.add(50);
        numbers.add(90);

        System.out.println(numbers);

        numbers.set(1, 1);
        System.out.println(numbers);

        numbers.remove(1);
        System.out.println(numbers);


        System.out.println(numbers.get(0));

        numbers.forEach(System.out::println);


    }

}
