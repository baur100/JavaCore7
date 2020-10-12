package Hw12;

public class House extends Hometype {
    protected int land;

    public int getLand() {
        return land;
    }

    public void setLand(int land) {
        this.land = land;
    }

    public House(int price, int sqft, int bed, int bath, int year, int land) {
        super(price, sqft, bed, bath, year);
        this.land = land;
    }


    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", sqft=" + sqft +
                ", bed=" + bed +
                ", bath=" + bath +
                ", year=" + year+
                ", land=" + land + '}';
    }}