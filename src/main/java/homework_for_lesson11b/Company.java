package homework_for_lesson11b;

public class Company {
    public static void main(String[] args) {
        Employee paul = new Employee ( "Paul","Russ","Analyst",3,247,"supervisor");
        Employee jane = new Employee("Jane","Brook","Counseoar",8,492,"senior advisor");

        Manager olga = new Manager ("Olga","Smith","Engineer",7,179 );
        Manager peter = new Manager("Peter","Bradly","Accountant",2,45);

        Developers tim = new Developers ( "Tim","Cook","Software Developer",20,"Java");
        Developers mark = new Developers("Mark","Sugarhill","Web designer",1,"Swift");
    }
}
