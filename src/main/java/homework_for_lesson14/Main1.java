package homework_for_lesson14;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String>pets = new ArrayList<>();

        pets.add("Cat");
        pets.add("Dog");
        pets.add("Kitten");
        pets.add("Parrot");
        System.out.println(pets);

        pets.add(2,"Puppy");
        System.out.println(pets);

        pets.set(1,"Rabbit");
        System.out.println(pets);

        pets.remove("Parrot");
        System.out.println(pets);

        pets.remove(1);
        System.out.println(pets);

        pets.forEach(System.out::println);

        int catIndex = pets.indexOf("Cat");
        System.out.println(catIndex);





    }
}
