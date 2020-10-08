package MyHomeworkQA.HwInterfaces;

public class App {

    public static void main(String[] args) {
        Penguin pap = new Penguin();
        Goose ali = new Goose();

        pap.makeASound();
        ali.makeASound();

        System.out.println(ali.canFly());
        System.out.println(pap.scientificName());

        Bird eve = new Goose();
        Bird tre = new Penguin();

        tre.makeASound();
        System.out.println(tre.canFly());

        eve.makeASound();
        System.out.println(eve.scientificName());

    }
}
