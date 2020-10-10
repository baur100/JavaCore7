package aehwlesson13;

public class App {
    public static void main(String[] args) {

        Vehicle someCar = new Vehicle(CarBrand.TESLA, CarColor.RED, CarType.SUV);

        System.out.println(someCar);

        System.out.println("----------------------------");

        Today d1 = new Today(WeekDay.SATURDAY);
        d1.weekend();


    }

}
