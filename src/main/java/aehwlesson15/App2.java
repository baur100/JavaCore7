package aehwlesson15;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App2 {
    public static void main(String[] args) {


        Map<Vehicle, Drive> myCarAll = new HashMap<>();

        ArrayList<Direction> myCarDirections = new ArrayList<>();
        myCarDirections.add(Direction.EAST);
        myCarDirections.add(Direction.NORTH);

        Drive myCarDrives = new Drive(myCarDirections);

        Vehicle myCar = new Vehicle(new Brand("BMW"), Color.BLACK);


        myCarAll.put(myCar, myCarDrives);
        System.out.println(myCarAll);

    }
}
