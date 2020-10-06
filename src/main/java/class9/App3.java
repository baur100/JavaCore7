package class9;

public class App3 {
    public static void main(String[] args) {
        Empty empty = new Empty();
        Pet pet = new Pet();
        pet.species = "Cat";
        pet.species = "Lion";
        System.out.println(pet.species);

        Star sirius = new Star();
        sirius.color = "Blue";
        sirius.size = 1000;

        Star x555347 = new Star();
        Star x557788 = new Star();

        House rt1212 = new House();
        rt1212.address = "12 Real Street, Real Town, State 12121";
        rt1212.price = 500000;
        rt1212.bathrooms = 7;
        rt1212.bedrooms = 2;
        rt1212.owner = "Mr X";
        rt1212.year = 2020;
        rt1212.square = 5000;

        String[] jameSubjects = {"Math", "History","Biology"};
        Student jane = new Student();
        jane.subject = jameSubjects;
        jane.name = "Jane";
        jane.lastName = "Robertus";
        jane.major = "Math";

        Student peter = new Student();
        peter.subject = new String[]{"Chemist", "History"};
        peter.major = "Dancing";
        peter.lastName = "Morris";
        peter.name = "Peter";




    }
}
