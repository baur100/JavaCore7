package homework9;

public class HW91 {
    public static void main(String[] args) {
        Book harry = new Book();
        harry.name = "Harry Potter";
        harry.author = "j.Rowling";
        harry.genre = "fantasy";
        harry.year = 1997;
        harry.edition = 500;

        Book draft = new Book();
        draft. name = "Final draft";
        draft.author = "S.Lukyanenko";
        draft.genre = "science fiction";
        draft.year = 2007;
        draft.edition = 2000;


        harry.about_book();
        draft.about_book();
    }
}

