package AEHWLesson9;

public class App {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Coco";
        dog1.breed = "Schnauzer";
        dog1.color = "grey";
        dog1.age = 2;
        dog1.adapted = true;

        dog1.isAdapted();

        Dog dog2 = new Dog();
        dog2.name = "Jack";
        dog2.breed = "Boxer";
        dog2.color = "brown";
        dog2.age = 7;
        dog2.adapted = false;

        dog2.isAdapted();

        System.out.println("==========================");

        House h1 = new House();
        h1.state = "CA";
        h1.price = 1200000;
        h1.city = "SF";

        h1.priceByState();

        House h2 = new House();
        h2.state = "CA";
        h2.price = 950000;
        h2.city = "Irvine";

        h2.priceByState();

        System.out.println("==========================");

        Phone myPhone = new Phone();
        myPhone.brand = "Pixel";
        myPhone.os = "Android";
        myPhone.osVersion = 11;
        myPhone.apps = new String[]{"Facebook", "Twitter"};

        myPhone.somePhone();
        myPhone.appsOnPhone();


        String[] yourPhoneApps = {"Facetime", "iMessage", "Facebook"};

        Phone yourPhone = new Phone();
        yourPhone.brand = "iPhone";
        yourPhone.os = "iOS";
        yourPhone.osVersion = 14;
        yourPhone.apps = yourPhoneApps;

        yourPhone.somePhone();
        yourPhone.appsOnPhone();


    }

}
