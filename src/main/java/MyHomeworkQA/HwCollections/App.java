package MyHomeworkQA.HwCollections;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;


public class App {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList();
        ArrayList<Integer> myInts = new ArrayList();
        ArrayList<Dog> myKennel = new ArrayList();

        // Strings
        myList.add("His life");
        myList.add("His sword");
        myList.add("His shield");
        myList.add("His axe");

        // Integers
        myInts.add(45);
        myInts.add(184);
        myInts.add(890);
        myInts.add(1562);

        // Dogs
        myKennel.add(new Dog("Rover", "Blue Lacey"));
        myKennel.add(new Dog("Amish", "Irish Setter"));
        myKennel.add(new Dog("Velvet", "Labradoodle"));
        myKennel.add(new Dog("Larry", "Pitbull"));
        Dog bixby = new Dog("Bixby","Golden Retriever");

        // Working with strings
        System.out.println(myList);
        myList.add("His sandwich");
        System.out.println(myList);
        System.out.println(myList.get(2));
        myList.remove("His axe");
        System.out.println(myList);
        System.out.println();

        // Working with integers
        System.out.println(myInts);
        myInts.set(3, 15091);
        myInts.add(342229);
        System.out.println(myInts);
        myInts.remove(2);
        System.out.println(myInts);
        myInts.remove(Integer.valueOf(45));
        for (Integer ix : myInts) {
            System.out.print("| "+ix+" ");
        }
        System.out.println("\n");

        // Working with Dogs
        for (Dog dog : myKennel) {
            System.out.println(dog.info());
        }
        System.out.println("");
        myKennel.remove(myKennel.size() - 1);
        myKennel.set(0, bixby);
        myKennel.add(new Dog("Mister Sir", "German Shepherd"));
        for (Dog dog : myKennel) {
            System.out.println(dog.info());
        }

    }
}
