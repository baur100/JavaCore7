package AElesson9;
// class - uppercase
// function and methods - lowercase
// variable - lowercase

public class App {
    public static void main(String[] args) {
        Person peter = new Person();
        peter.lastName = "Dole";
        peter.name = "Peter";
        peter.gender = "Male";
        peter.year = 1990;

        Person anna = new Person();
        anna.lastName = "Dole";
        anna.name = "Anna";
        anna.gender = "Female";
        anna.year = 1995;

        peter.introduce();
        anna.introduce();

        String annaInfo = anna.getPersonInfo();
        System.out.println(annaInfo);

//        Partial info
        Person james = new Person();
        james.name = "James";
        james.gender = "Male";

        james.introduce();
        System.out.println(james.getPersonInfo());
    }
}
