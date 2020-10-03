package hw9;

public class CityApp {
    public static void main(String[] args) {
        City nyc = new City();
        nyc.name = "New York City";
        nyc.area = 468.19;
        nyc.population = 8175133;

        City seattle = new City();
        seattle.name = "Seattle";
        seattle.area = 142.07;
        seattle.population = 608660;

        seattle.info();
    }
}
