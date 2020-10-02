package Homework_3;

public class Toy_objects {
    public static void main(String[] args) {
        Toy alex = new Toy();
        alex.name = "Alex";
        alex.type = "Bear";
        alex.size = "big";
        alex.owner = "Sam";

        alex.introduce();

        Toy emma = new Toy();
        emma.name = "Emma";
        emma.type = "doll";
        emma.size = "small";
        emma.owner = "Lily";

        emma.introduce();

        String alexInfo = alex.toyInfo();
        System.out.println(alexInfo);

        String emmaInfo = emma.toyInfo();
        System.out.println(emmaInfo);
    }
}
