package Homework4;

public class Car_object {
    public static void main(String[] args) {
    Car car = new Car();
    car.setName("Car");

    String name = car.getName();
    car.setName("Car");

    car.setMake("Mercedes");
    String make = car.getMake();

    car.setModel("GLE");
    String model = car.getModel();

    System.out.println("I am awesome" + " " + make + " " + model);
    }
}
