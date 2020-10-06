package hw12;

public class App {
//    Create an interface and 2 classes which implements it
//    Create 2 objects of each class
//    Assign one object to interface type

    public static void main(String[] args) {
        Car myCar = new Car();
        Car mikesCar = new Car();
        myCar.setEngine("started");
        mikesCar.setEngine("stopped");

        myCar.start();
        mikesCar.start();


        Truck n1 = new Truck();
        Truck n2 = new Truck();
        n1.setDistance(1);
        n1.setLoad("loaded");
        n2.setDistance(0);
        n2.setLoad("loading");

        n1.start();
        n1.stop();
        n2.start();
        n2.stop();

    }
}
