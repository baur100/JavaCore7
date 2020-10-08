package lesson13;

public class App {
    public static void main(String[] args) {
        Colors cherry = Colors.RED;
        String cherry1 = "Red";
        String cherry2 = "RED";
        String cherry3 = "red";

        Address schoolAddress = new Address("154 New Dorp Lane", "Staten Island","NY", 10306);
        School newDorpHigh = new School(schoolAddress, SchoolType.PUBLIC,"New Dorp High School",SchoolGrade.HIGH);

        School school1 = newDorpHigh;
        System.out.println(newDorpHigh.getType());
        school1.setType(SchoolType.PRIVATE);
        System.out.println(newDorpHigh.getType());

    }
}
