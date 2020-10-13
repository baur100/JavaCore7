package hw13;

import java.util.Arrays;

public class Movie {
    public Movie(String name, Genre[] genre, Rating rating, Director[] director) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.director = director;
    }

    private String name;
    private Genre[] genre;
    private Rating rating;
    private Director[] director;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre=" + Arrays.toString(genre) +
                ", rating=" + rating +
                ", director=" + Arrays.toString(director) +
                '}';
    }
}

