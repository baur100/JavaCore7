package notes16;

import java.util.Random;

public class Helper {
    //CAN CREATE AN OJ AND CONSTRUCTOR W/SET N GET
    private String name;
    private static String dummy; // will be able to call stitics inside class but not inside static radom method
    public Helper (String names){
        this.name=names;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public static void randomNumberGeneratorTwo(){
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
    }
}
