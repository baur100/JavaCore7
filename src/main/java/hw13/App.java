package hw13;

public class App {
    public static void main(String[] args) {
//      =====================================
        Programming[] myProgramming = {Programming.JavaScript, Programming.PHP, Programming.Java};
        Employee me = new Employee("Murat", 2, myProgramming);

        System.out.println(me.getName() + " knows: ");
        for (Programming v : me.getProgramming()) {
            System.out.println("\t"+v);
        }

//      ======================================

        DragRace race1 = new DragRace(1000, CarBrand.Porsche, 11.7);
        System.out.println(race1.getCar());
    }
}
//Create 2 Enums, Create 2 classes. First using Enum, Second Array of Enums as a Field
