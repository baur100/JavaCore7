package lesson9;

public class App2 {
    public static void main(String[] args) {
         Fruit grennySmith = new Fruit();
         grennySmith.color = "Green";
         grennySmith.name = "Apple";

         Fruit goldenDelisious = new Fruit();
         goldenDelisious.color = "Yellow";
         goldenDelisious.name = "Apple";

        grennySmith.printFruitInfo();

        goldenDelisious.printFruitInfo();

    }
}
