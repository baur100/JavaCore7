package homework_for_lesson14;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<>();

        digits.add(15);
        digits.add(-4);
        digits.add(0);
        digits.add(39);
        System.out.println(digits);

        Integer oldValue = digits.set(3, 41);
        System.out.println(oldValue);
        System.out.println(digits);

        digits.remove(1);
        System.out.println(digits);

        boolean xx = digits.contains(94);
        System.out.println(xx);

        digits.forEach(System.out::println);

        List firstDigit = digits.subList(0,1);
        System.out.println(firstDigit);

    }
    }

