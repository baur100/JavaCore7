package aelesson13;

public class App {
    public static void main(String[] args) {

        // we use enums when we have a limited number of values.
        // we limit ourselves only to this choice of values.
        Colors cherry = Colors.RED;
        String cherry1 = "Red";
        String cherry2 = "RED";
        String cherry3 = "red";

        Address schoolAddress = new Address("154 New Dorp Lane", "Staten Island", "NY", 10306);

        School newDorpHigh = new School(schoolAddress, SchoolType.PUBLIC, "New Dorp High School", SchoolGrade.HIGH);

        System.out.println(newDorpHigh);

        // school1 and newDorpHigh are the same object now. If we make changes to schools1, it will change it too.
        // school1 and newDorpHigh reference type objects. They reference to the same part of the memory.
        // With school1 we do not create another object, we kind of copy reference from newDorpHigh
        School school1 = newDorpHigh;

        school1.setType(SchoolType.PRIVATE);

        System.out.println(newDorpHigh);

    }
}
