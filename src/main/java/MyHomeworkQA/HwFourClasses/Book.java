package MyHomeworkQA.HwFourClasses;

public class Book {

        String title;
        String author;
        int yearPublished;

        public int getYearPublished() {
            return yearPublished;
        }

        public String getTitleAndAuthor(){
            return title+" was written by "+author;
        }

}
