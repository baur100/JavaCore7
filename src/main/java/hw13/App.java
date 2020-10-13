package hw13;

import h11plus.Monitor;

public class App {
    public static void main(String[] args) {


        Rating[] ratings = {Rating.R, Rating.G, Rating.PG13, Rating.NC17};
        Rating[] ratings1 = {Rating.R, Rating.G, Rating.PG13, Rating.NC17};
        Rating[] ratings2 = {Rating.R, Rating.G, Rating.PG13, Rating.NC17};

        Genre[] genres = {Genre.COMEDY, Genre.ACTION, Genre.HOROOR, Genre.ANIMATION};
        Genre[] genres1 = {Genre.COMEDY, Genre.ACTION, Genre.HOROOR, Genre.ANIMATION};
        Genre[] genres3 = {Genre.ACTION, Genre.CRIMINAL, Genre.SCIFI};

        TVseries tvSeries1 = new TVseries("Breaking bad", genres, ratings, "Rian Jonson");
        TVseries tvSeries2 = new TVseries("Broadwalk Empire", genres1, ratings1, "Terrence Winter");
        TVseries tvSeries3 = new TVseries("Game of thrones", genres3, ratings2, "David Nutter");


        Director[] director = {Director.LYNCH, Director.MALICK, Director.POLANSKI, Director.PECKINPAH};
        Movie movie1 = new Movie("Terminator", genres3, Rating.R, director);
        Movie movie2 = new Movie("Terminator", genres3, Rating.R, director);
        Movie movie3 = new Movie("Terminator", genres3, Rating.R, director);


        System.out.println("\n"+movie1);
        System.out.println(movie2);
        System.out.println(movie3);
        System.out.println("\n"+tvSeries1.toString());
        System.out.println(tvSeries2.toString());
        System.out.println(tvSeries3.toString());

    }
}
