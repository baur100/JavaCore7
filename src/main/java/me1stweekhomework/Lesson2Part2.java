package me1stweekhomework;

public class Lesson2Part2 {

    public static void main(String[] args) {

//        int age = 25;
//        int price = 1000;
//
//        if (age <= 2){
//            System.out.println("Free ticket");
//        }
//        if (age <= 12) {
//            System.out.println("Child ticket: "+ price * 0.5);
//        }
//        if (age >= 65){
//            System.out.println("Senior ticket: "+ price * 0.8);
//        }
//        else {
//        System.out.println("Adult ticket: "+ price);
//        }


        int age = 16;

        if (age < 15) {
            System.out.println("You are " + age + " y.o and not allowed to drive");
        }
        if (age >= 15 && age < 16) {
            System.out.println("You are " + age + " y.o and can get a driver's permit");
        }
        if (age >= 16 && age < 18) {
            System.out.println("You are " + age + " y.o and can drive with restrictions");
        } else {
            if (age >= 18 && age < 21) {
                System.out.println("You are " + age + " y.o and can have a regular driver's license. But you are not allowed to purchase alcohol yet.");
            }
            if (age >= 21) {
                System.out.println("You are " + age + " y.o and can have a regular driver's licence." + '\n' + "You are legally allowed to do whatever you want, even buy alcohol :)");
            }
        }
    }

}
