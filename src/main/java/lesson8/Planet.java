package lesson8;

public class Planet {
    public String name;
    public int radius;
    public int temperature;
    public double eqLength;

    public double equatorLength() {
        eqLength = 2 * radius * Math.PI;
        return eqLength;
    }
}
