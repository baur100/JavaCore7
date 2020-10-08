package MyHomeworkQA.HwInterfaces;

public class Goose implements Bird {

    private String sciName = new String("Branta");

    @Override
    public String scientificName() {
        return this.sciName;
    }

    @Override
    public void makeASound() {
        System.out.println("Honk honk!");
    }

    @Override
    public String canFly() {
        return "I can fly high in the sky";
    }
}
