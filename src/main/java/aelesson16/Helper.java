package aelesson16;

import java.util.Random;

public class Helper {
    private String name;
    private static String dummy;

    public Helper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printRandomNumber(){
        Random random = new Random();
        int number = random.nextInt(100); //random number from 0 to 99, bound of 100 is not included
        System.out.println(number);
        //name = "Ann"; //Non-static field cannot be invoked from static method

    }
}
