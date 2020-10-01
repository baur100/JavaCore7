package class9;

public class app2 {
    public static void main(String[] args) {
        Fruit grannySmith = new Fruit();
        grannySmith.color = "Green";
        grannySmith.name = "Apple";

        Fruit goldenDelicious = new Fruit();
        goldenDelicious.color = "Yellow";
        goldenDelicious.name = "Apple";

        grannySmith.printFruitInfo();
        goldenDelicious.printFruitInfo();

    }
}

