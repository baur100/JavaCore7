package aehwlesson12;

public class Triangle implements Perimeter{
    private int sideA;
    private int sideB;
    private int base;

    public Triangle(int sideA, int sideB, int base) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.base = base;
    }

    @Override
    public int perimeter() {
        return sideA + sideB + base;
    }
}

