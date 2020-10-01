package Homework_3;

public class Flower_object {
    public static void main(String[] args) {
        Flower rose = new Flower();
        rose.color = "Red";
        rose.name = "Rose";
        rose.smell = "Sweet";

        Flower rose2 = new Flower();
        rose2.color = "White";
        rose2.name = "Rose2";
        rose2.smell = "Sweetest";

        rose.introduce();
        rose2.introduce();
        rose.getFlowerinfo();


    }
}
