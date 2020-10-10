package homework13;

public class Weight {
    private int amount;
    private WeightUnitOfMeasure unit;

    public Weight(int amount, WeightUnitOfMeasure unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public int getAmount() {
        return amount;
    }

    public WeightUnitOfMeasure getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return amount  + unit.toString();
    }
}
