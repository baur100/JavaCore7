package hwk20;

public abstract class Whales {
    private String whales;

    public Whales(String whales) {
        this.whales = whales;
    }

    @Override
    public String toString() {
        return "Whales{" +
                "whales='" + whales + '\'' +
                '}';
    }
}
