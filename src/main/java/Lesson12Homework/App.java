package Lesson12Homework;

public class App {
    public static void main (String []args){

    Car mercedez = new Car();
        mercedez.PrintEveryAction();
        mercedez.vehicleBrand();
        mercedez.fuelType();
        mercedez.vehiclePrice();
        mercedez.vehicleType();
        mercedez.vehicleSpeed();
        mercedez.vehicleYear();

        System.out.println("\n ----------------------------------------------");

        Motorcycle myMotorcycle = new Motorcycle();
        myMotorcycle.PrintEveryAction();
        myMotorcycle.vehicleBrand();
        myMotorcycle.fuelType();
        myMotorcycle.vehiclePrice();
        myMotorcycle.vehicleType();
        myMotorcycle.vehicleSpeed();
        myMotorcycle.vehicleYear();

        System.out.println("\n ----------------------------------------------");

        Trucks myTruck = new Trucks();
        myTruck.PrintEveryAction();
        myTruck.vehicleBrand();
        myTruck.fuelType();
        myTruck.vehiclePrice();
        myTruck.vehicleType();
        myTruck.vehicleSpeed();
        myTruck.vehicleYear();

        System.out.println("\n ----------------------------------------------");

        Car yourCar = new Car();
        yourCar.PrintEveryAction();
        yourCar.vehicleBrand1();
        yourCar.fuelType1();
        yourCar.vehiclePrice1();
        yourCar.vehicleType1();
        yourCar.vehicleSpeed1();
        yourCar.vehicleYear1();

//        System.out.println("\n ----------------------------------------------");
//
//        Motorcycle yourMotorcycle = new Motorcycle();
//        yourMotorcycle.PrintEveryAction1();
//        yourMotorcycle.vehicleBrand1();
//        yourMotorcycle.fuelType1();
//        yourMotorcycle.vehiclePrice1();
//        yourMotorcycle.vehicleType1();
//        yourMotorcycle.vehicleSpeed1();
//        yourMotorcycle.vehicleYear1();
//
//        System.out.println("\n ----------------------------------------------");
//
//        Trucks yourTruck = new Trucks();
//        yourTruck.PrintEveryAction();
//        yourTruck.vehicleBrand1();
//        yourTruck.fuelType1();
//        yourTruck.vehiclePrice1();
//        yourTruck.vehicleType1();
//        yourTruck.vehicleSpeed1();
//        yourTruck.vehicleYear1();

    }
}
