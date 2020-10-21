package hw15Hashmap;

public class Rgb {
    private int red1;
    private int red2;
    private int green1;
    private int green2;
    private int blue1;
    private int blue2;

    public Rgb(int red1, int red2, int green1, int green2, int blue1, int blue2) {
        this.red1 = red1;
        this.red2 = red2;
        this.green1 = green1;
        this.green2 = green2;
        this.blue1 = blue1;
        this.blue2 = blue2;
    }

    @Override
    public String toString() {
        return "rgb(" + red1 + red2 + " " + green1 + green2 + " " + blue1 + blue2 + ");";
    }
}
