package homework10;

public class Book {
        private String name;
        private String author;
        private String genre;
        private int year;

        public int getYear() {
            return year;
        }

        public String getAuthor() {
            return author;
        }

        public String getGenre() {
            return genre;
        }

        public String getName() {
            return name;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setYear(int year) throws Exception {
            if (year > 2020 || year < 1700){
                throw new Exception( "Wrong year");
            }
            this.year = year;
        }
        public void about_book() {
            System.out.println( "Famous book "+name+" by "+author+" was published first time in "+year+".");
        }
        public Book(){}

        public Book(String name, String author, String genre, int year){
            this.name = name;
            this.author =author;
            this.genre = genre;
            this.year = year;
        }
    }


