package aehwlesson13;

public class App {
    public static void main(String[] args) {

        CarColor[] carColors1 = {CarColor.BLACK, CarColor.RED, CarColor.SILVER};

        Vehicle someCar = new Vehicle(CarBrand.TESLA, carColors1, CarType.SUV);

        System.out.println(someCar);

        System.out.println("----------------------------");

        Today d1 = new Today(WeekDay.SATURDAY);
        d1.weekend();




    }

}
