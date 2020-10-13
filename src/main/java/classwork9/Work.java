package classwork9;

public class Work {
    public static void main(String[] args) {
        Person vlad = new Person();
        vlad.lastName = "Vainel";
        vlad.name = "Vlad";
        vlad.gender = "Male";
        vlad.yearOfBirth = 1988;

        vlad.intro();

        String vladInfo = vlad.getPersonInfo();
        System.out.println(vladInfo);

        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Vainel";
        anna.gender = "Female";
        anna.yearOfBirth = 1986;

        anna.intro();
        System.out.println(anna.getPersonInfo());
    }
}
