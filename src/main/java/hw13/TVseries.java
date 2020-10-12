package hw13;

public class TVseries {
    protected String name;
    private Genre genre;
    private Rating rating;
    private String director;

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public Rating getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }


    public TVseries(String name, Genre genre, Rating rating, String director) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.director = director;

    }
    @Override
    public String toString() {
        return "TVseries{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", rating=" + rating +
                ", director='" + director + '\'' +
                '}';
}
}