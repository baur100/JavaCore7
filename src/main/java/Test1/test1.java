package Test1;

public class test1 {
    public static void main(String[] args) {
        VehicleT myCar = new VehicleT();
        myCar.year=2010;
        myCar.model="Mkz";
        myCar.brand="Lincoln";
        myCar.color="Gray";
        myCar.name="I'm";

        VehicleT friendCar = new VehicleT();
        friendCar.year=2020;
        friendCar.model="X2";
        friendCar.brand="BMW";
        friendCar.color="Red";
        friendCar.name="Linda's";

        myCar.drive();
        friendCar.drive();

        System.out.println(" ");

        myCar.horn();
        friendCar.horn();

    }

}
