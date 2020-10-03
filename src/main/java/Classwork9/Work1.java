package Classwork9;

public class Work1 {
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle();
        myCar.year = 2020;
        myCar.make = "Ford";
        myCar.model = "Mustang";
        myCar.color = "Orange";

        Vehicle myWifesCar = new Vehicle();
        myWifesCar.year = 2007;
        myWifesCar.make = "Toyota";
        myWifesCar.model = "Sequoia";
        myWifesCar.color = "White";

        myCar.drive();
        myWifesCar.drive();

        myCar.horn();
        myWifesCar.horn1();

    }
}
