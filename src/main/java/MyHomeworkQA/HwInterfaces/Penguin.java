package MyHomeworkQA.HwInterfaces;

public class Penguin implements Bird {

    private String sciName = new String("Aptenodytes Forsteri");

    @Override
    public String scientificName() {
        return this.sciName;
    }

    @Override
    public void makeASound() {
        System.out.println("Gack gack!");
    }

    @Override
    public String canFly() {
        return "I don't fly, I waddle on the ice";
    }
}
