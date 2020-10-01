package AElesson9;

public class App2 {
    public static void main(String[] args) {
        Fruit grennySmith = new Fruit();
        grennySmith.color = "Green";
        grennySmith.name = "Apple";

        Fruit goldenDelicious = new Fruit();
        goldenDelicious.color = "Yellow";
        goldenDelicious.name = "Apple";

        grennySmith.printFruit();
        goldenDelicious.printFruit();
    }
}
