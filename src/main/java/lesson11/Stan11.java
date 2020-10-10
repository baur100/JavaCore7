package lesson11;

public class Stan11 {
    public static void main(String[] args) {
        Elephant fatherElephant = new Elephant("Joseph", "Grey", 4, 2);
        Elephant motherElephant = new Elephant("Marta", "Dark Grey", 4, 1);

        Wolf majorWolf = new Wolf("Rubio", "White", 4, "Woo-ooo-oo!");
        Wolf oldWolf = new Wolf("Vincent", "brown", 3, "Woo!");

        Zebra zebra1 = new Zebra("Sasha", "White&Black", 4, true);
        Zebra zebra2 = new Zebra("Glasha", "White&Black", 4, true);

        Animal animal1 = new Animal("name", "color", 4);
        Animal animal2 = new Animal("name", "color", 4);

    }
}
