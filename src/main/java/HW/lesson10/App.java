package main.java.HW.lesson10;

public class App {
    public static void main(String[] args) {
        Car car = new Car("England", "work", "blue", "honda", 65000, "USA");
        System.out.println(car.getVehicleInfo());

        Aircraft aircraft = new Aircraft("Ukraine", "domestic", "white", 450, false, 5000);
        System.out.println(aircraft.getVehicleInfo());

        MilitaryAircraft militaryAircraft = new MilitaryAircraft("France", "defence", "yellow", 850, true, 9000, "nuclear", 6, true);
        System.out.println(militaryAircraft.getVehicleInfo());

    }
}
