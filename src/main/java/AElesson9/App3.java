package AElesson9;

public class App3 {
    public static void main(String[] args) {

//        There is no sense in Empty object, but it can be created from Empty type
        Empty empty = new Empty();
        Pet pet = new Pet();
        pet.kind = "Cat";
        pet.kind = "Lion";
        System.out.println(pet.kind);

        Star sirius = new Star();
        sirius.color = "Blue";
        sirius.size = 1000;

        Star x555 = new Star();
        Star x666 = new Star();

        String[] janeSubjects = {"Math", "History", "Biology"};

        Student jane = new Student();
        jane.subject = janeSubjects;
        jane.name = "Jane";
        jane.lastName = "Roberts";
        jane.major = "Math";

        Student peter = new Student();
        peter.subject = new String[]{"Chemistry", "History"};
        peter.major = "Dancing";
        peter.lastName = "Morris";
        peter.name = "Peter";


    }
}
