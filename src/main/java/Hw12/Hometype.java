package Hw12;

public class Hometype {
    protected int price;
    protected int sqft;
    protected int bed;
    protected int bath;
    protected int year;

    public Hometype(int price, int sqft, int bed, int bath, int year) {
        this.price = price;
        this.sqft = sqft;
        this.bed = bed;
        this.bath = bath;
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public int getSqft() {
        return sqft;
    }

    public int getBed() {
        return bed;
    }

    public int getBath() {
        return bath;
    }

    public int getYear() {
        return year;
    }
}
