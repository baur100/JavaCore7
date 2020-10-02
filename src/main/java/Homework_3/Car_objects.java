package Homework_3;

public class Car_objects {
    public static void main(String[] args) {

        Car car = new Car();
        car.name = "Car";
        car.make = "Mercedes";
        car.model = "GLE 350";
        car.year = "2020";
        car.owner = "Anna";

        car.introduce();

        Car car2 = new Car();
        car2.name = "Car";
        car2.make = "Mercedes";
        car2.model = "ML 350";
        car2.year = "2015";
        car2.owner = "Anna";

        car2.introduce();
    }
}
