package aelesson11;

public class App {
    public static void main(String[] args) {

        // 2nd OOP pilar - Inheritance and Relationships
        // base classes and super class


        String[] maryAnnSubjects = {"Chemistry", "Math", "Biology", "Geometry"};
        Student maryAnn = new Student("Mary-Ann", "Dole", "F", 1995, "Math", maryAnnSubjects);

        Teacher mrJones = new Teacher("Paul", "Jones", "M", 1980, "History");

        Manager msMarple = new Manager("Martha", "Marple", "F", 1980, "Director");
    }
}
