package HW14;

import java.util.List;

public class NewAppleProducts {
    private List<String> gadgets;
    private List<Name> names;
    private List<Double> price;

    public NewAppleProducts(List<String> gadgets, List<Name> names, List<Double> price) {
        this.gadgets = gadgets;
        this.names = names;
        this.price = price;
    }

    public List<String> getGadgets() {
        return gadgets;
    }

    public List<Name> getNames() {
        return names;
    }

    public List<Double> getPrice() {
        return price;
    }

    public NewAppleProducts(List<String> gadgets) {
        this.gadgets = gadgets;

    }

    @Override
    public String toString() {
        return "NewAppleProducts{" +
                "gadgets=" + gadgets +
                ", \nNames=" + names +
                ", \nPrice=" + price +
                '}';
    }
}
