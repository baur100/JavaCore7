package hw13;

import java.util.Arrays;

public class TVseries {
    protected String name;
    private Genre[] genre;
    private Rating[] rating;
    private String director;

    public TVseries(String name, Genre[] genre, Rating[] rating, String director) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.director = director;
    }


    @Override
    public String toString() {
        return "TVseries{" +
                "name='" + name + '\'' +
                ", genre=" + Arrays.toString(genre) +
                ", rating=" + Arrays.toString(rating) +
                ", director='" + director + '\'' +
                '}';
    }
}