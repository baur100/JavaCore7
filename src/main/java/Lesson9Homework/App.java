package Lesson9Homework;

public class App {
    public static void main(String[]args){
 //--------------------------------------------------------------//
    Animals species = new Animals();
    species.type = "Wild";
    species.age = 10;
    species.name = "Black Tiger";

    Animals species1 = new Animals();
    species1.type = "Sea Animal";
    species1.age = 14;
    species1.name = "Blue Whale";

    Animals species2 = new Animals();
    species2.type = "Reptiles";
    species2.age = 2;
    species2.name = "Black Cobra";

    species.printAnimals();
        System.out.println("-----------------------------------");
    species1.printAnimals();
        System.out.println("-----------------------------------");
    species2.printAnimals();
        System.out.println("-----------------------------------");
    //--------------------------------------------------------------//
    Cars vehicles = new Cars();
    vehicles.brand = "Chevy";
    vehicles.model = "SubUrban";
    vehicles.price = 32000;
    vehicles.year = 2019;

    Cars vehicles1 = new Cars();
    vehicles1.brand = "Ford";
    vehicles1.model = "Mustang";
    vehicles1.price = 65000;
    vehicles1.year = 2020;

    Cars vehicles2 = new Cars();
    vehicles2.brand = "Toyota";
    vehicles2.model = "Land Cruiser";
    vehicles2.price = 75000;
    vehicles2.year = 2020;

    vehicles.printCars();
    System.out.println("-----------------------------------");
    vehicles2.printCars();
    System.out.println("-----------------------------------");

    //--------------------------------------------------------------//
    Food myFood = new Food();
    myFood.name = "Shawarma";
    myFood.origin ="Palestine";
    myFood.price = 8;


    Food myFood1 = new Food();
    myFood1.name = "Biryani";
    myFood1.origin ="Pakistan";
    myFood1.price = 10;


    Food myFood2 = new Food();
    myFood2.name = "Kabuli Pilau";
    myFood2.origin ="Afghanistan";
    myFood2.price = 20;

    myFood.printFood();
    System.out.println("-----------------------------------");
    myFood1.printFood();
    System.out.println("-----------------------------------");
    myFood2.printFood();
        System.out.println("-----------------------------------");
    //--------------------------------------------------------------//
    House residence = new House();
    residence.city = "Los Angeles";
    residence.type = "Apartment";
    residence.year = 1998;
    residence.price = 560000;

        House residence1 = new House();
        residence1.city = "Torrance";
        residence1.type = "Condominium";
        residence1.year = 1967;
        residence1.price = 450000;

        House residence2 = new House();
        residence2.city = "Anaheim";
        residence2.type = "House";
        residence2.year = 1980;
        residence2.price = 9650000;

        residence.printHouse();
        System.out.println("-----------------------------------");
        residence1.printHouse();
        System.out.println("-----------------------------------");
        residence2.printHouse();

    }
}
