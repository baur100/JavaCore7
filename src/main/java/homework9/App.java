package homework9;
//1. Create 4 classes with fields and methods
//        2. In the App class create main() and create 2 instances of each class,
//        fill all fields
//        invoke methods
public class App {

    public static void main(String[] args) {
        Phone apple = new Phone();
        apple.name = "iPhone";
        apple.model = "7";
        apple.yearofmanufacture = 2010;
        apple.price = 100.00;
        apple.condition = "new";

        Phone google = new Phone();
        google.name = "Google";
        google.model = "Pixel";
        google.yearofmanufacture = 2019;
        google.price = 500;
        google.condition = "new";
apple.iphone();
google.android();
    }
}