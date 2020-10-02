package Homework_3;

public class Book {
    public String name;
    public String size;
    public String type;

    public void introduce(){
        System.out.println("This is book" + " " + name);
        System.out.println(name + " " + "is a" + " " + type);
        System.out.println(name + " " + "is a" + " " + size + " "
                + "book");
    }
}
