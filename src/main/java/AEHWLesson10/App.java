package AEHWLesson10;

public class App {
    public static void main(String[] args) {
        /*1. Create 4 classes with fields (at least 3 fields) and methods (at least 1 method)
        each class has at least 2 constructors (default and full)
        create printClass()/ printInfo() method to print out all fields
        fields are private
        each field has getter and setter
        2. In the App class create main() and create 2 instances of each class;
        one instance created used default constructor - fill up fields using setter
        second object created using full constructor
        print object info using print-out method*/

        Dog dog1 = new Dog("Puffy", "Schnauzer", "yellow", 4, true);
        dog1.isAdapted();

        Dog dog2 = new Dog();
        dog2.setName("Sharik");
        dog2.setAge(6);
        dog2.dogAge();

        System.out.println("==========================");

        Phone phone1 = new Phone("Pixel","Android", 11);
        phone1.somePhone();


        Phone phone2 = new Phone();
        phone2.setBrand("iPhone");
        phone2.setApps(new String[]{"Facetime", "iMessage", "Facebook"});

        phone2.appsOnPhone();

        System.out.println("==========================");

        House home1 = new House("CA", "Irvine",1200000);
        home1.priceByState();

        House home2 = new House();
        home2.setCity("Miami");
        home2.setState("FL");
        home2.setPrice(500000);
        home2.yourHome();



    }
}
