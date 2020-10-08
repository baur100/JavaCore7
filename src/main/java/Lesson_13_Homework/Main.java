package Lesson_13_Homework;

public class Main {
    public static void main(String[] args) {
        Animals animal = Animals.crocodile;
        Animals animal1 = Animals.giraffe;
        Animals animal2 = Animals.bird;
        Animals animal3 = Animals.lizard;

        String[] food = {"meat", "leaves", "mice", "kernel"};
        String[] zooInfo = {};

        Food meat = Food.meat;

       Zoo dfw = new Zoo("dfw", "large", 20);


        System.out.println("All animals in our Zoo loves " +
                "to eat different" + " " + meat);
        System.out.println(animal + " " + "is the best friends with"
        + " " + animal1);

    }

}
