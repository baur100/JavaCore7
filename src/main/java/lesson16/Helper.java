package lesson16;

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
        int number = random.nextInt(100);
        System.out.println(number);
    }

}
