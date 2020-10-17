package Lesson12Homework;

public class Trucks implements Vehicles {
    @Override
    public void vehicleBrand() {
        System.out.println("Ford ");
    }
    @Override
    public void vehicleType() {
        System.out.println("\n Heavy Duty F350 ");
    }
    @Override
    public void vehiclePrice() {
        System.out.println("\n Ford ");
    }
    @Override
    public void fuelType() {
        System.out.println("\n Gas Premium ");
    }
    @Override
    public void vehicleYear() {
        System.out.println("\n 2015 ");
    }
    @Override
    public void vehicleSpeed() {
        System.out.println("\n 140 miles / hr ");
    }
    //------------------------------------------------
//
//    @Override
//    public void vehicleBrand1() {
//        System.out.println(" Harley Davidson ");
//    }
//    @Override
//    public void vehicleType1() {
//        System.out.println("\n Highway Motorcycle \n ");
//    }
//    @Override
//    public void vehiclePrice1() {
//        System.out.println(10000);
//    }
//    @Override
//    public void fuelType1() {
//        System.out.println("\n Gas ");
//    }
//    @Override
//    public void vehicleYear1() {
//        System.out.println("\n 2020 ");
//    }
//    @Override
//    public void vehicleSpeed1() {
//        System.out.println("\n 120 miles/ hr ");
//    }
//
    public void PrintEveryAction(){
        System.out.println("Here is all the details of My Truck ");
    }
}
