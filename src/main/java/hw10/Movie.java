package hw10;

public class Movie {
    private String name;
    private int year;
    private double rating;
    private int raters;

    public Movie() {}

    public Movie(String name, int year, double rating, int raters) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.raters = raters;
    }

    public void addRating(double yourRating) {
        rating = (rating * raters + yourRating) / raters++;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public int getRaters() {
        return raters;
    }

    public void printInfo() {
        System.out.println("Movie: " +
                "\nName: " + name +
                "\nYear: " + year +
                "\nrating: " + rating +
                "\nraters: " + raters);
    }
}
