package hw9;

public class App {
    public static void main(String[] args) {
        //        City app
        City nyc = new City();
        nyc.name = "New York City";
        nyc.area = 468.19;
        nyc.population = 8175133;

        City seattle = new City();
        seattle.name = "Seattle";
        seattle.area = 142.07;
        seattle.population = 608660;

        seattle.info();

        //        Account app
        Account checking = new Account();
        checking.number = "145 874 8473";
        checking.balance = 17281;

        Account savings = new Account();
        savings.number = "145 874 0032";
        savings.balance = 30000;

        checking.addMoney(2000);

        // Fitness app
        Fitness barbellPress = new Fitness();
        barbellPress.exercise = "Barbel press";
        barbellPress.sets = 4;
        barbellPress.weight = 100;
        barbellPress.reps = 10;

        Fitness barbellSquarts = new Fitness();
        barbellSquarts.exercise = "Barbel squarts";
        barbellSquarts.sets = 4;
        barbellSquarts.weight = 120;
        barbellSquarts.reps = 10;

        barbellSquarts.start();

        // To do list app
        Todo list1 = new Todo();
        list1.title = "Buy milk";

        Todo list2 = new Todo();
        list2.title = "Buy bread";

        list1.done();
        list1.wip();
        System.out.println(list1.status);

    }
//  1. Create 4 classes with fields and methods
//  2. In the App class create main() and create 2 instances of each class, fill all fields
//  invoke methods
}