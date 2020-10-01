package L9;

public class App3 {
    public static void main(String[] args) {
        Empty empty = new Empty();
        Pet pet = new Pet();
        pet.spicies = "Cat";
        pet.spicies = "Lion";
        System.out.println(pet.spicies);

        Star sirius = new Star();
        sirius.color = "Blue";
        sirius.size = 1000;

        Star x555347 = new Star();
        Star x557788 = new Star();

        House rt1212 = new House();
        rt1212.address = "12 Real street, real town, state 12121";
        rt1212.price = 500000;
        rt1212.bathrooms = 7;
        rt1212.bedrooms = 2;
        rt1212.owner = "Mr X";
        rt1212.year = 2020;
        rt1212.square = 5000;

        String[] xx = {"xx"};
        String[] janeSubjects = {"Math", "History", "Biology"};
        Student jane = new Student();
        jane.subjects = janeSubjects;
        jane.name = "Jane";
        jane.lastName = "Robertus";
        jane.major = "Math";

        Student peter = new Student();
        peter.subjects = new String[]{"Chemistry", "History"};
        peter.major = "Dancing";
        peter.lastName = "Morris";
        peter.name = "Peter";

    }
}
