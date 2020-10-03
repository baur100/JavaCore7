package homework9;

public class App {
    public static void main(String[] args){
        Employee kenny = new Employee();  // Employee class
        kenny.firstName = "Kenny";
        kenny.lastName = "Love";
        kenny.yearJoined = 2001;
        kenny.currentEmplyee = true;

        Employee sarah = new Employee();
        sarah.firstName = "Sarah";
        sarah.lastName = "Connor";
        sarah.yearJoined = 1984;
        sarah.currentEmplyee = false;

        kenny.introdue();
        sarah.introdue();

        String kennInfo = kenny.getEmployeeInfo();
        System.out.println(kennInfo);

        String sarahInfo = sarah.getEmployeeInfo();
        System.out.println(sarahInfo);

        Dog lucus = new Dog();      // Dog class
        lucus.name = "Lucus";
        lucus.breed = "Golden Retriver";
        lucus.age = 3;
        lucus.color = "yellow";

        Dog beyonce = new Dog();
        beyonce.name = "Beyonce";
        beyonce.breed = "Shiba Inu";
        beyonce.age = 5;
        beyonce.color = "black";

        lucus.summonDog();
        beyonce.summonDog();

        String locusInfo = lucus.getDogInfo();
        System.out.println(locusInfo);

        String bibiInfo = beyonce.getDogInfo();
        System.out.println(bibiInfo);



    }
}
