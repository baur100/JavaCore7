package hw15Hashmap;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // LARGEST COUNTRIES IN THE WORLD IN ORDER
        Map<Integer, String> largestCountries = new HashMap<>();
        largestCountries.put(1, Countries.RUSSIA.toString());
        largestCountries.put(2, Countries.CANADA.toString());
        largestCountries.put(3, Countries.USA.toString());
        largestCountries.put(4, Countries.CHINA.toString());

        for (Map.Entry<Integer, String> entry : largestCountries.entrySet()) {
            int listPlace = entry.getKey();
            String country = entry.getValue();

            System.out.println(listPlace + ". " + country);
        }

        System.out.println("\n=====================================================\n");

        // web colors by name and HEX value
        Map<String, String> colorHex = new HashMap<>();
        List<Colors> colors = new ArrayList<>();
        colors.add(Colors.RED);
        colors.add(Colors.GREEN);
        colors.add(Colors.BLUE);
        colors.add(Colors.YELLOW);
        colorHex.put(colors.get(0).toString(), "#FF0000");
        colorHex.put(colors.get(1).toString(), "#008000");
        colorHex.put(colors.get(2).toString(), "#0000FF");
        colorHex.put(colors.get(3).toString(), "#FFFF00");

        for (Map.Entry<String, String> entry : colorHex.entrySet()) {
            String color = entry.getKey();
            String hex = entry.getValue();

            System.out.println(color + ": " + hex);
        }

        System.out.println("\n=====================================================\n");

        // Colors compare RGBA vs HEX
        Map<Rgb, Hex> rgbHex = new HashMap<>();
        Rgb black = new Rgb(0,0, 0,0, 0,0);
        Rgb gray = new Rgb(5,0, 5,0, 5,0);
        Rgb white = new Rgb(10,0, 10,0, 10,0);
        Rgb navy = new Rgb(0,0, 0,0, 8,0);
        rgbHex.put(black, new Hex("00", "00", "00"));
        rgbHex.put(gray, new Hex("80","80","80"));
        rgbHex.put(white, new Hex("FF", "FF","FF"));
        rgbHex.put(navy, new Hex("FF", "FF","FF"));

        System.out.println("White: " + white + " or " + rgbHex.get(white));
    }
}


//Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
//add 4 elements to each hashmap
//        try methods  put/replace/remove/get/foreach
//        Create 2 Enums
//        Create 2 classes
//        - first will have field with type enum
//- second - field as ArrayList<enum.type>