package homework_for_lesson10;

public class Applying2 {
    public static void main(String[] args) {
        Toys toys = new Toys();
        Toys doll = new Toys("Doll Masha", 23471, 29);


        toys.setName("Ball");
        toys.setId(14589);
        toys.setPrice(7);

        toys.printToysInfo();
        doll.printToysInfo();

    }
}
