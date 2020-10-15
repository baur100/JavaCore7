package classwork16;

import java.util.Random;

public class Helper {
    public static void printRandomNumber(){
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
    }
}
