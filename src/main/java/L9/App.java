package L9;

public class App {
    public static void main(String[] args) {
        Person peter = new Person();
        peter.lastName = "Dole";
        peter.name = "Peter";
        peter.gender = "Male";
        peter.year = 1990;

        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Dole";
        anna.gender = "Female";
        anna.year = 1995;

        peter.introduce();
        anna.introduce();

        String annaInfo = anna.getPersonInfo();
        System.out.println(annaInfo);

        Person james = new Person();
        james.name = "James";
        james.gender = "Male";
        james.introduce();
        System.out.println(james.getPersonInfo());
    }

}
