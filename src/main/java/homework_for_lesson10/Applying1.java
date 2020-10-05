package homework_for_lesson10;

public class Applying1 {
    public static void main(String[] args) {
        Box box = new Box();
        Box kitten = new Box ("box for kitten",30 ,15);


        box.setName("Large box for senior cats");
        box.setLength(50);
        box.setWidth(40);

        box.getInfo();
        kitten.getInfo();

    }
}
