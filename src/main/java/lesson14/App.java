package lesson14;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String[] array = new String[5];

        list.add("Red");
        array[0] = "Red";

        String green = "Green";

        list.add(green);
        array[1] = green;

//        System.out.println(list.get(0));
//        System.out.println(array[0]);
//
//        System.out.println(array.length);
//        System.out.println(list.size());


        List<String> colors = new ArrayList<String>();

        colors.add("Blue");
        System.out.println(colors.size());
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Cyan");

        System.out.println(colors);
//        System.out.println(array);
        System.out.println(colors.size());

        String lastElement = colors.get(3);
        System.out.println(lastElement);
        colors.add(1,green);
        System.out.println(colors);

        String oldValue = colors.set(0,"Magenta");
        System.out.println(oldValue);
        System.out.println(colors);

        colors.add("Red");
        boolean xx = colors.contains("Red");
        System.out.println(xx);

        System.out.println(colors);
        colors.remove("Green");
        System.out.println(colors);
        colors.remove(1);
        System.out.println(colors);
        List<String> lightColors = new ArrayList<>();
        lightColors.add("Light Blue");
        lightColors.add("Light Magenta");
        lightColors.add("Light Green");

        colors.addAll(2,lightColors);
        System.out.println(colors);

        colors.add("Pink");

        System.out.println(colors);

        int pinkIndex = colors.indexOf("Pink");
        System.out.println(pinkIndex);

        colors.remove("Pink");
        System.out.println(colors);

        int greyIndex = colors.indexOf("Grey");
        System.out.println(greyIndex);

        List threeColor = colors.subList(1,3);
        System.out.println(threeColor);

        colors.forEach(System.out::println);


    }
}
