package homework_for_lesson10;

public class Applying3 {
    public static void main(String[] args) {

    Car myCar = new Car();
    Car myDaughter = new Car("Nissan", "red", 8900);


        myCar.setName("Lexus");
        myCar.setColor("silver");
        myCar.setPrice(39999);

        myCar.printCarInfo();
        myDaughter.printCarInfo();
}

}
