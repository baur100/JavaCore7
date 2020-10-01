package AElesson9;

public class App1 {
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle();
        myCar.year = 1986;
        myCar.model = "Corolla";
        myCar.brand = "Toyota";
        myCar.color = "Violet";

        Vehicle myFriendsCar = new Vehicle();
        myFriendsCar.year = 2011;
        myFriendsCar.model = "Pilot";
        myFriendsCar.brand = "Honda";
        myFriendsCar.color = "Silver";

        myCar.drive();
        myFriendsCar.drive();

        myCar.horn();
        myFriendsCar.horn();
    }
}
