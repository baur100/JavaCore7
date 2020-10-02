package homework9;

public class Book {

    public String name;
    public String author;
    public String genre;
    public int year;
    public int edition;

    public void about_book() {
        System.out.println( "Famous book "+name+" by "+author+" was published first time in "+year);
    }
}
