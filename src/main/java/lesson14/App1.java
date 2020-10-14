package lesson14;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
//        List<int> list = new ArrayList<>();
        int a1 = 5;
        Integer a2 = 5;

        double b1 = 5.5;
        Double b2 = 5.5;

        boolean c1 = true;
        Boolean c2 = true;

        char d1 = 'q';
        Character d2 = 'q';

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(-58);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);
    }
}
