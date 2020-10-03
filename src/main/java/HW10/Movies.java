package HW10;

public class Movies {
    private String movie;
    private String director;
    private int yearcreated;

    public void setMovie(String n){
        movie = n;
    }
    public String getMovie(){
        return this.movie;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public String getDirector(){
        return this.director;
    }
    public void setYearcreated(int yearcreated) throws Exception {
        if(yearcreated>2020 || yearcreated<1900){
            throw new Exception("Invalid Year");
        }
        this.yearcreated = yearcreated;
    }
    public Movies(int yearcreated, String movie, String director){
        this.yearcreated = yearcreated;
        this.movie = movie;
        this.director = director;
    }
    public Movies(){

    }

    public void printMovieInfo(){
        System.out.println(movie+" directed by: "+director+" came out "+yearcreated);
    }
}
