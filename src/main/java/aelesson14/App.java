package aelesson14;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //Collections - more advanced array

        ArrayList<String> list = new ArrayList<String>();
        String[] array = new String[5];

        //To add something to array.list we have to use method.

        //Comparison between array and ArrayList
        list.add("Red");
        array[0] = "Red";

        String green = "Green";

        list.add(green);
        array[1] = green;

        System.out.println(list.get(0));
        System.out.println(array[0]);

        // ArrayList size is flexible in comparison to array pre-fixed size
        System.out.println(array.length);
        System.out.println(list.size());

        //ArrayList is a Class. It has methods

        List<String> colors = new ArrayList<String>();

        colors.add("Blue");
        System.out.println(colors.size());
        colors.add ("Brown");
        colors.add("Pink");
        colors.add("Cyan");

        //will print the ArrayList as it has toString method inside it. For array it will not work, as array more primitive.
        System.out.println(colors);

        System.out.println(colors.size());

        //Get elements of ArrayList
        String lastElement = colors.get(colors.size()-1);
        System.out.println(lastElement);

        //Add additional values to the ArrayList
        colors.add(1, green);
        System.out.println(colors);

        //Replace values of the ArrayList
        colors.set(0, "Magenta");
        System.out.println(colors);


       //Contains - boolean
        colors.add("Red");
        boolean xx = colors.contains("Red");
        System.out.println(xx);

        //Remove values
        System.out.println(colors);
        colors.remove("Green");
        System.out.println(colors);

        //Remove by index
        colors.remove(1);
        System.out.println(colors);

        //Create Sublist

        List<String> lightColors = new ArrayList<>();
        lightColors.add("Light Blue");
        lightColors.add("Light Magenta");
        lightColors.add("LightGreen");


        //Add sublist to the main list
        colors.addAll(lightColors);
        //colors.addAll(2, lightColors); - by index
        System.out.println(colors);

        //IndexOf - will get index of the first found element
        colors.add("Pink");
        System.out.println(colors);

        int pinkIndex = colors.indexOf("Pink");
        System.out.println(pinkIndex);

        //We have 2 "Pink in the arrayList and it will remove the first found
        colors.remove("Pink");
        System.out.println(colors);

        //indexOf - value does not exist - will return -1
        int greyIndex = colors.indexOf("Grey");
        System.out.println(greyIndex);

        //Get sublist - .subList
        List threeColor = colors.subList(1,3);
        System.out.println(threeColor);


    }
}
