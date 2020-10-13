package classwork13;

public class Work {
    public static void main(String[] args) {
        Colors1 cherry = Colors1.RED;

        Address schoolAddress = new Address("7026 Captiva Cir" , "New Port Richey", "FL", 34655);
        School captivaCir = new School(schoolAddress, SchoolType.PUBLIC, "Captiva School", SchoolGrade.HIGH);


    }
}
