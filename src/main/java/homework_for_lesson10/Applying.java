package homework_for_lesson10;

public class Applying {
    public static void main(String[] args) {
        Cat cat = new Cat();

        Cat kitten = new Cat("Vasya","black",1,2);
        cat.setName("Michael");
        cat.setColor("red");
        cat.setAge(3);
        cat.setWeight(5);

        cat.printCatInfo();
        kitten.printCatInfo();
    }
}
