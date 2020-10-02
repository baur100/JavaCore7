package Homework_for_lesson9;

public class Applying {
    public static void main(String[] args) {
        Cats myCat= new Cats();
        myCat.breed="Siberian";
        myCat.name="Michael";
        myCat.age=3;
        myCat.color="red";
        myCat.personality="independent";
        myCat.weight= 4;

        Cats mysonCat=new Cats();
        mysonCat.breed="Britain";
        mysonCat.name="Boris";
        mysonCat.age=5;
        mysonCat.color="grey";
        mysonCat.personality="friendly";
        mysonCat.weight=7;

        myCat.promote();
        mysonCat.promote();


    }
}
