package Claswork14;

import java.util.ArrayList;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String[] array = new String[5];

        list.add("Red");
        array[0] = "Red";

        String green = "Green";

        list.add(green);
        array[1] = green;

        System.out.println(list.get(0));
        System.out.println(array[0]);

        System.out.println(array.length);
        System.out.println(list.size());

        List<String> colors = new ArrayList<String>();

        colors.add("Blue");
        System.out.println(colors.size());
        colors.add("Brown");
        colors.add("Pink");

        System.out.println(colors);
        System.out.println(colors.size());

        String lastElement = colors.get(colors.size()-1);
        System.out.println(lastElement);

        colors.add(1, green);
        System.out.println(colors);

        colors.set(0, "Black");
        System.out.println(colors);









    }
}
