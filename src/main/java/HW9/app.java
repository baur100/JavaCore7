package HW9;


public class app {
    public static void main(String[] args) {
        String[] xx = {"xx"};
        String[] judySubjects = {"Math","History","Biology","Band","English"};
        School mySchedule = new School();
        mySchedule.fname = "Judy";
        mySchedule.lname = "Burke";
        mySchedule.subjects = judySubjects;
        mySchedule.grade1 = 10;

        BandInstr myBandclass = new BandInstr();
        myBandclass.grade = 9;
        myBandclass.instrument = "Flute";
        myBandclass.firstname = "Tonya";
        myBandclass.lastname = "Burnes";

        Bakery mydessert = new Bakery();
        mydessert.price = 3;
        mydessert.type = "Cupcakes";
        mydessert.flavor = "Chocolate";

        Sandwich myfood = new Sandwich();
        myfood.price2 = 3;
        myfood.Food = "Ham Sandwich";
        myfood.bread = "White";

        mydessert.type();
        mydessert.flavor();

        myfood.Food();
        System.out.println(myfood.getFoodInfo());

        myBandclass.instrument();
        myBandclass.lastname();

        mySchedule.fname();
        mySchedule.grade1();

    }
}
