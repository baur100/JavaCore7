package homework14;

import java.util.ArrayList;

public class HW141 {
    public static void main(String[] args){

    ArrayList<Book> books = new ArrayList<>();
  /*  Book one = new Book("War and Peace", "Tolstoj", 1869);
    books.add(one);

    Book two = new Book("Beginning", "Kalugin, 2013);
*/
        books.add(new Book("War and peace", "Tolstoj", 1869));
        books.add(new Book("Nachalo", "Kalugin", 1869));
        books.add(new Book("The end", "Ivanov", 2019));
        books.add(new Book("Second rule", "Mishin", 2001));

        System.out.println(books);

        books.remove(1);
        System.out.println(books);


        System.out.println(books.get(0));

       books.set(2,new Book("Idiot", "Dostoevskij", 1869));
        System.out.println(books);

      /* for (Book book : books){
            System.out.println(book.getAuthor());*/

        books.forEach(x-> System.out.println(x.getName()+" "+x.getAuthor()));



    }
}

