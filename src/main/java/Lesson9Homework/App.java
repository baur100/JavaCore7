package Lesson9Homework;

public class App {

    public static void main (String [] args ) {

        Animal species1 = new Animal();
        species1.name = "Tiger";
        species1.type = " Mammal";
        species1.age = 5;


        Animal species2 = new Animal();
        species2.name = "Snake";
        species2.type = "reptile ";
        species2.age = 3;

        Animal species3 = new Animal();
        species3.name = "Frog";
        species3.type = "Amphibian";
        species3.age = 2;


        species1.printAnimal();
        System.out.println("-----------------------------");
        species2.printAnimal();
        System.out.println("-----------------------------");
        species3.printAnimal();
        System.out.println("-----------------------------");

        //-------------------------------------------------------//
        Car Type1 = new Car();
        Type1.Brand = "Mercedes";
        Type1.Modal = "AMG ";
        Type1.year = 2020;

        Car Type2 = new Car();
        Type2.Brand = "BMW";
        Type2.Modal = "M5";
        Type2.year = 2019;


        Type1.printCar();
        System.out.println("-----------------------------");
        Type2.printCar();
        System.out.println("-----------------------------");

        //-------------------------------------------------------//


        Food myFood = new Food();
        myFood.Origin = "Pakistan";
        myFood.name = " Biryani ";
        myFood.price = 10;

        Food myFood1 = new Food();
        myFood1.Origin = " USA";
        myFood1.name = " Meat loaf ";
        myFood1.price = 15;

        myFood.printFood();
        System.out.println("-----------------------------");
        myFood1.printFood();
        System.out.println("-----------------------------");

        //---------------------------------------------------------//
        House myHouse = new House();
        myHouse.Type = "Villa";
        myHouse.price = 2000000;
        myHouse.year = 2001;

        House myHouse1 = new House();
        myHouse1.Type = " Apartment";
        myHouse1.price = 250000;
        myHouse1.year = 1985;

        myHouse.printHouse();
        System.out.println("-----------------------------");
        myHouse1.printHouse();
        System.out.println("-----------------------------");

        //----------------------------------------------------------//
    }
}
