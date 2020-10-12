package aehwlesson14;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {
        ArrayList<Vehicle> car = new ArrayList<>();

        car.add(new Vehicle("BMW", "black"));
        car.add(new Vehicle("Tesla", "white"));
        car.add(new Vehicle("Lexus", "silver"));

        System.out.println(car.get(2));

        System.out.println("====================");

        for (Vehicle v : car) {
            System.out.println(v.getBrand() + " " + v.getColor());
        }
    }
}
