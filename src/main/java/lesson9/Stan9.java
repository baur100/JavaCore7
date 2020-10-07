package lesson9;

public class Stan9 {
    public static void main(String[] args) {

        Student victor = new Student();
        Student oksana = new Student("Oksana", "Ruzh", 22, "female");

        victor.setAge(21);
        victor.setName("Victor");
        victor.setGender("male");
        victor.setLastname("Ryzhakov");

        victor.print();
        oksana.print();

        Fruit apple = new Fruit();
        Fruit cherry = new Fruit("Cherry", "Red", 1);

        apple.setFruitName("Apple");
        apple.setFruitColor("Green");
        apple.setWeight(2);

        apple.printFruitInfo();
        cherry.printFruitInfo();
    }
}
