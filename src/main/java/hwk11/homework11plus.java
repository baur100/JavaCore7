package hwk11;

import java.util.Arrays;

public class homework11plus {
    public static void main(String[] args) {
        //1. Create a super class and 3 child classes
        //create 2 object of each class (including superclass - don't make it abstract)

        Aussie mydog = new Aussie("medium", 40.3, "Australian Shepered", "Tri color");
        Aussie mySeconDog = new Aussie("medium", 34.2, "Australian Shepered", "Blue Marl");

        Husky myHuskie = new Husky("large", 84, "Siberian Husky", "White");
        Husky mySecodHuskie = new Husky("large", 79, "Siberian Husky", "Black and White");

        Chihuahua litleDog = new Chihuahua("small", 3, "Chihuahua", "Brown");
        Chihuahua tinyDog = new Chihuahua("tea cup", 2, "Chihuahua", "Honey Brown");


        System.out.println(myHuskie);
        System.out.println(mydog);

    }


}
