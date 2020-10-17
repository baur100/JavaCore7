package Lesson12Homework;

public class Car implements Vehicles {

    @Override
    public void vehicleBrand() {
        System.out.println("Tesla");
    }
    @Override
    public void vehicleType() {
        System.out.println(" 4 Door Sedan S Type ");
    }
    @Override
    public void vehiclePrice() {
        System.out.println("\n $ 4200");
    }
    @Override
    public void fuelType() {
        System.out.println("\n Electric ");
    }
    @Override
    public void vehicleYear() {
        System.out.println("\n 2019 ");
    }
    @Override
    public void vehicleSpeed() {
        System.out.println("\n 160 miles / hour ");
    }
    //-----------------------------------

    public void vehicleBrand1() {
        System.out.println("Tesla");
    }

    public void vehicleType1() {
        System.out.println(" 4 Door Sedan S Type ");
    }

    public void vehiclePrice1() {
        System.out.println("\n $ 4200");
    }

    public void fuelType1() {
        System.out.println("\n Electric ");
    }
    public void vehicleYear1() {
        System.out.println("\n 2019 ");
    }
    public void vehicleSpeed1() {
        System.out.println("\n 160 miles / hour ");
    }

    public void PrintEveryAction(){
        System.out.println("Here is all the details of My Car ");
    }
}
