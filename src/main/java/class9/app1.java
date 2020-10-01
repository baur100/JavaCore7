package class9;

public class app1 {
    public static void main(String[] args){
        Vehicle myCar = new Vehicle();

        myCar.year = 1986;
        myCar.model = "Corolla";
        myCar.brand = "Toyota";
        myCar.color = "Violet";

        Vehicle myFriendsCar = new Vehicle();
        myFriendsCar.year = 2011;
        myFriendsCar.color = "Silver";
        myFriendsCar.brand = "Honda";
        myFriendsCar.model = "Pilot";


        myCar.drive();
        myFriendsCar.drive();

        myCar.horn();
        myFriendsCar.horn();
    }
}
