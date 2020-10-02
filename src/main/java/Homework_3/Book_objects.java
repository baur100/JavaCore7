package Homework_3;

public class Book_objects {
    public static void main(String[] args) {
        Book emma = new Book();
        emma.name = "Emma";
        emma.size = "small";
        emma.type = "romance";

        emma.introduce();
        Book anna = new Book();
        anna.name = "Anna";
        anna.size = "big";
        anna.type = "Thriller";

        anna.introduce();
    }
}
