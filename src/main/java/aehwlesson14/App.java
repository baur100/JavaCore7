package aehwlesson14;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //Create 3 ArrayList - String, Integer and some Custom class
        //Add 4+ elements to each List
        //exercise methods add/set/remove/get/foreach and etc

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        evenNumbers.add(2);
        evenNumbers.add(20);
        evenNumbers.add(200);
        int xx = 2000;
        evenNumbers.add(xx);


        System.out.println(evenNumbers);
        System.out.println(evenNumbers.size());

        int yy = evenNumbers.set(1, 40);
        System.out.println(yy);
        System.out.println(evenNumbers);

        evenNumbers.remove(0);
        System.out.println(evenNumbers);

        System.out.println(evenNumbers.get(0));
        System.out.println(evenNumbers.get(evenNumbers.size()-1));

        evenNumbers.add(0,2);
        evenNumbers.add(1, 20);

        List<Integer> subset = evenNumbers.subList(0,2);
        System.out.println(subset);

        evenNumbers.forEach(z -> System.out.println(z.intValue()));

    }
}
