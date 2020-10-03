package hw9;

public class City {
    public String name;
    public double area;
    public int population;

    public void info() {
        System.out.println("City: " + name);
        System.out.println("Area: " + area + " sq mi");
        System.out.println("Last reported population: " + population);
    }
}
