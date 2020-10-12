package hw13;

import h11plus.Monitor;

public class App {
    public static void main(String[] args) {
Movie movie1 = new Movie("Interstellar",Genre.SciFi,Rating.PG,"Christopher Nolan");
TVseries tvSeries1 = new TVseries("Breaking bad", Genre.Criminal,Rating.R,"Rian Jonson");
TVseries tvSeries2 = new TVseries("Broadwalk Empire", Genre.Criminal,Rating.R,"Terrence Winter");
TVseries tvSeries3 = new TVseries("Game of thrones", Genre.SciFi,Rating.R,"David Nutter");


TVseries[] tVseriesall = {tvSeries1,tvSeries2,tvSeries3};

        System.out.println(movie1);
        System.out.println(tVseriesall.toString());
        System.out.println(tvSeries2);

        Enum[] TVseries= new Enum[] {Genre.Action,Genre.Animation,Genre.Criminal,Genre.SciFi};
        System.out.println(TVseries.toString());
    }
}
