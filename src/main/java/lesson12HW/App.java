package lesson12HW;

public class App {
    public static void main ( String [] args){

        Cat myCat1 = new Cat();
        myCat1.PrintEveryAction();
        myCat1.animalSound2();
        myCat1.animalSleep();
        myCat1.animalEat();

        System.out.println("\n----------------------------------");

        Cat myCat2 = new Cat();
        myCat2.PrintEveryAction();
        myCat1.animalSound1();
        myCat1.animalSleep();
        myCat1.animalEat();


        System.out.println("\n----------------------------------");

        Dog myDog1 = new Dog();
        myDog1.printEveryAction();
        myDog1.animalSound1();
        myDog1.animalEat();
        myDog1.animalSleep();

        System.out.println("\n----------------------------------");

        Dog myDog2 = new Dog();
        myDog2.printEveryAction();
        myDog2.animalSound2();
        myDog2.animalEat();
        myDog2.animalSleep();

        System.out.println("\n----------------------------------");

        Lion myLion1 = new Lion();
        myLion1.printEveryAction();
        myLion1.animalSound1();
        myLion1.animalEat();
        myLion1.animalSleep();

        System.out.println("\n----------------------------------");

        Lion myLion2 = new Lion();
        myLion2.printEveryAction();
        myLion2.animalSound2();
        myLion2.animalEat();
        myLion2.animalSleep();
    }
}
