package hw14;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // First Arraylist perform add/foreach
        System.out.println("\n Task 1: ");

        List<String> shoeTypes = new ArrayList<>();
        shoeTypes.add("Oxford");
        shoeTypes.add("Derby");
        shoeTypes.add("Monk");
        shoeTypes.add("Brogue");
        shoeTypes.add("Loafers");
        shoeTypes.add("Chelsea");
        shoeTypes.add("Sneakers");

        System.out.print("Men's popular shoe types are: ");
        for (String v : shoeTypes) {
            System.out.print(v + " ");
        }

        // Second Arraylist perform add/set/size/add by index
        System.out.println("\n\n Task 2: ");

        List<Integer> lotteryNumbers = new ArrayList<>();
        lotteryNumbers.add(5);
        lotteryNumbers.add(45);
        lotteryNumbers.add(87);
        lotteryNumbers.set(0, 56);
        lotteryNumbers.add(1, 23);

        for (int i=0; i<lotteryNumbers.size(); i++) {
            System.out.println("Winner number " + (i+1) + " is " + lotteryNumbers.get(i));
        }

        // Third Arraylist perform custom class/add/remove
        System.out.println("\n Task 3: ");

        Goal job = new Goal("IT job", 2021, 10000);
        Goal car = new Goal("Mercedes-Benz", 2021, 50000);
        Goal house = new Goal("House", 2025, 500000);
        Goal travel = new Goal("Jamaica", 2021, 2000);
        List<Goal> myGoals = new ArrayList<>();
        myGoals.add(job);
        myGoals.add(car);
        myGoals.add(house);
        myGoals.add(travel);
        myGoals.add(new Goal("Seattle", 2020, 3000));
        myGoals.remove(travel);

        for (Goal v : myGoals) {
            v.printGoal();
        }
    }
}

//Create 3 ArrayList - String, Integer and some Custom class
//Add 4+ elements to each List
//exercise methods add/set/remove/get/foreach and
