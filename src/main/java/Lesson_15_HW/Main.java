package Lesson_15_HW;

import java.util.HashMap;
import java.util.Map;

//Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
//add 4 elements to each hashmap
//try methods  put/replace/remove/get/foreach

public class Main {
    public static void main(String[] args) {
        Map<String,String> cars = new HashMap<>();
        cars.put("Audi", "A7");
        cars.put("Mercedes", "AMG GLE");
        cars.put("MBW", "X7 M");
        cars.put("Land Rover", "Velar");
        System.out.println(cars);
        cars.replace("Audi", "A8");
        System.out.println(cars);
        cars.remove("Land Rover");
        System.out.println(cars);
        cars.get("Velar");
        System.out.println(cars);

        Map<Integer,String> clothe = new HashMap<>();
        clothe.put(2, "shorts");
        clothe.put(4, "skirt");
        clothe.put(6, "blouse");
        clothe.put(8, "dress");
        System.out.println(clothe);
        clothe.replace(2, "skirt");
        System.out.println(clothe);
        clothe.remove(8);
        System.out.println(clothe);

        Map<fruits,vegetables> food = new HashMap<>();
        food.put(new fruits("Orange"), new vegetables("Cucumber"));
        food.put(new fruits("Banana"), new vegetables("Paper"));
        food.put(new fruits("Apple"), new vegetables("Tomato"));
        food.put(new fruits("Plum"), new vegetables("Potato"));
        System.out.println(food.size());
        food.replace (new fruits("Orange"), new vegetables("Melon"));
        System.out.println(food);
    }

}
