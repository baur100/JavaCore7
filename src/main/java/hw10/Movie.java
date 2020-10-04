package hw10;

public class Movie {
    private String name;
    private int year;
    private double rating;
    private int ratedCount;

    public Movie(String name, int year, double rating, int ratedCount) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.ratedCount = ratedCount;
    }

    public void addRating(double yourRating) {
        rating = (rating * ratedCount + yourRating) / ratedCount++;
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
        return ratedCount;
    }
}
