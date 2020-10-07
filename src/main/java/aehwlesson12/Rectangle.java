package aehwlesson12;

public class Rectangle implements Perimeter{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int perimeter() {
        int p = 2 * (length + width);
        return p;
    }
}
