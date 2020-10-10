package homework13;

public class Length {
    private int amount;
    private LengthUnitOfMeasure unit;

    public Length(int amount, LengthUnitOfMeasure unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public int getAmount() {
        return amount;
    }

    public LengthUnitOfMeasure getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return String.format("%d%s", amount, unit);
    }
}

