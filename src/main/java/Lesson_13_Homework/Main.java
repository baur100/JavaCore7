package Lesson_13_Homework;

public class Main {
    public static void main(String[] args) {
        Animals animal = Animals.CROCODILE;
        Animals animal1 = Animals.GIRAFFE;
        Animals animal2 = Animals.BIRD;
        Animals animal3 = Animals.LIZARD;

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
