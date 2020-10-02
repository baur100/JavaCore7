package homework9;

public class HW92 {
    public static void main(String[] args) {

        Coach first = new Coach();
        first.lastName = "Snow";
        first.firstName = "John";
        first.gender = "Male";
        first.sport = "Sport orientation";
        first.location = "Winterfell";
        first.pricePerHour = 125;

        Coach second = new Coach();
        second.lastName = "Stark";
        second.firstName = "Arya";
        second.gender = "Female";
        second.sport = "Archery";
        second.location = "Westeros";
        second.pricePerHour = 150;

        System.out.println(Coach.classDescription());
        first.aboutMe();
        second.aboutMe();

        String firstInfo = first.coachInfo();
        System.out.println(firstInfo);

        String secondInfo = second.coachInfo();
        System.out.println(secondInfo);

    }
}
