package class9;

public class app {
    public static void main(String[] args){
        Person1 peter = new Person1();
        peter.lastName = "Dole";
        peter.name = "Peter";
        peter.gender = "Male";
        peter.year = 1990;

        Person1 anna = new Person1();
        anna.name = "Anna";
        anna.lastName = "Dole";
        anna.gender = "Female";
        anna.year = 1995;

        peter.introduce();
        anna.introduce();

        String annaInfo = anna.getPersonInfo();
        System.out.println(annaInfo);

        Person1 james = new Person1();
        james.name = "James";
        james.gender = "Male";
        james.introduce();
        System.out.println(james.getPersonInfo());
    }


}
