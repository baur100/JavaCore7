package aelesson14;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {

        //ArrayList is working with Classes only and int is a primitive
        //List<int> list = new ArrayList<>();

        //Integer replaces int, but behaves as class
        // Wrapper Classes replace primitive type, so they have methods and can be used in collections
        //ArrayList is as a wrapper class for array
        int a1 =5;
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
        numbers.add(99);
        System.out.println(numbers);


    }
}
