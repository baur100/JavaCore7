package work;

import work.Kids;
import work.People;
import work.items;

public class App {
    public static void main(String[] args) {

       Family ivanovi = new Family();
       ivanovi.size = 4;
       ivanovi.annualIncome =45000;
       ivanovi.hasPet = true;
       System.out.println("How many people = "  + ivanovi.size );
        System.out.println( "Income = " + ivanovi.annualIncome);



        items item = new items();
        item.size = "big";
        item.sofa = 1;
        item.table =1;
        item.tv =1;
        item.brand = "Samsung";
        System.out.println("=======================================") ;
        System.out.println("Room has how many tables = " + item.table) ;
        System.out.println( "What size of the room? = " + item.size );

        People person = new People();
        person.name = "Sveta";
        person.age = 23;
        person.number = 40556589;
        person.smoking = true;
        System.out.println("=======================================") ;
        System.out.println( "What is primary household name? = " +   person.name  );
        System.out.println( "Do we charge extra for extra cleaning = " + person.smoking);

        Kids kid = new Kids();
        kid.name = "Ivan";
        kid.age = 5;
        kid.hasSiblings = false;
        System.out.println("=======================================") ;
        System.out.println( "what is kid name? = " + kid.name );
        System.out.println( "How old is a child = " +   kid.age );




    }
}