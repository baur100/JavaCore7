package homework9;

public class HW94 {
    public static void main(String[] args) {
        Passport one = new Passport();
        one.firstName = "John";
        one.lastName = "Smith";
        one.yearOfBirth = 1984;
        one.nationality = "USA";
        one.placeOfBirth = "Hawaii";

        Passport two = new Passport();
        two.firstName = "Esmeralda";
        two.lastName = "Garda";
        two.yearOfBirth = 1975;
        two.nationality = "Italy";
        two.placeOfBirth = "Spain";

        String oneInfo = one.getPersonInfo();
        System.out.println(oneInfo);

        String twoInfo = two.getPersonInfo();
        System.out.println(twoInfo);
    }
}
