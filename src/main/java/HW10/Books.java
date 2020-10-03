package HW10;

public class Books {
    private String book;
    private String author;
    private int yearpub;

    public void setBook(String n){
        book = n;
    }
    public String getBook(){
        return this.book;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setYearpub(int yearpub) throws Exception {
        if(yearpub>2020 || yearpub<1900){
            throw new Exception("Invalid Year");
        }
        this.yearpub = yearpub;
    }
    public Books(int yearpub, String book, String author){
        this.yearpub = yearpub;
        this.book = book;
        this.author = author;
    }
    public Books(){}

    public void printBooksInfo(){
        System.out.println(book+" "+author+" published in "+yearpub);
    }
}
