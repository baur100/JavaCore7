package hw15Hashmap;

public class Hex {
    private String red;
    private String green;
    private String blue;

    public Hex(String red, String green, String blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "#" + red + green + blue + ";";
    }
}
