package Lesson10Homework;

import java.sql.SQLOutput;

public class App {


    public static void main(String[]args){


       Bedroom bedroom1 = new Bedroom("Bed","Ashleys",2050);
       bedroom1.printBedroom();

        System.out.println("-----------------------------------------------");

        Bedroom myBedroom = new Bedroom(); //Creating an object using default empty constructor

        myBedroom.setBrand("Jeromes");
        myBedroom.setType("NightStand");
        myBedroom.setCost(250);
        myBedroom.printBedroom();

        System.out.println("-----------------------------------------------");

        Cellphone myCellPhone = new Cellphone(900, "Samsung" , "Galaxy S20");
        myCellPhone.printCellPhone();

        System.out.println("-----------------------------------------------");

        Cellphone cellPhone1 = new Cellphone(); //Creating an object using default empty constructor

        cellPhone1.setCost(700);
        cellPhone1.setBrand("Apple");
        cellPhone1.setName("Iphone 11");
        cellPhone1.printCellPhone();

        System.out.println("-----------------------------------------------");

        LivingRoom LivingRoom1 = new LivingRoom("Large Sofa collection ","Jeromes", 2000);
        LivingRoom1.printLivingRoom();

        System.out.println("-----------------------------------------------");

        LivingRoom myLivingroom = new LivingRoom(); //Creating an object using default empty constructor

        myLivingroom.setBrand("Coffe table collection");
        myLivingroom.setType("Ashleys");
        myLivingroom.setCost(150);
        myLivingroom.printLivingRoom();

        System.out.println("-----------------------------------------------");


        Planets myPlanet= new Planets("Pluto ", 9, "smaller");
        myPlanet.printPlanets();

        System.out.println("-----------------------------------------------");

        Planets planet = new Planets(); //Creating an object using default empty constructor

        planet.setName("Jupiter");
        planet.setBiggerOrSmallerThanEarth("Bigger");

        myBedroom.setCost(250);
        myBedroom.printBedroom();

        // System.out.println(myBedroom.getBrand() + " " + myBedroom.getType() + " " + myBedroom.getCost());

    }
}
