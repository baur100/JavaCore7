package Hw12;

public class Condo extends Hometype{
    protected int hoa;

    public int getHoa() {
        return hoa;
    }

    public Condo(int price, int sqft, int bed, int bath, int year, int hoa) {
        super(price, sqft, bed, bath, year);
        this.hoa = hoa;
    }


        @Override
    public String toString() {
        return "Condo{" +
            "price=" + price +
                    ", sqft=" + sqft +
                    ", bed=" + bed +
                    ", bath=" + bath +
                    ", year=" + year+
                ", hoa=" + hoa +
                '}';
    }

}
