package homework10;


public class Hw101 {
    public static void main(String[] args) throws Exception {
        NewPassport myPassport = new NewPassport();
        myPassport.setFirstName("Anna");
        myPassport.setLastName("Smith");
        myPassport.setNationality("USA");
        myPassport.setYearOfBirth(1990);

        myPassport.info();

        NewPassport hisPassport = new NewPassport("Michael", "Kearns", 1970, "Germany");
        hisPassport.info();

        Book myBook = new Book();
        myBook.setName("Black Sea");
        myBook.setAuthor("Ivan Ivanov");
        myBook.setGenre("Poetry");
        myBook.setYear(1965);

        myBook.about_book();

        Book hisBook = new Book("The advanture of Tom Sawyr", "Mark Twain","adventure", 1876);

        hisBook.about_book();

        Coach alina = new Coach();

        alina.setFirstName("Alina");
        alina.setLastName("Kabaeva");
        alina.setGender("F");
        alina.setSport("Rhytmic gymnastic");

        alina.aboutMe();

        Coach igor = new Coach("Igor", "Akinfeev", "M", "Soccer");

        igor.aboutMe();

        Appliance washer = new Appliance();
        washer.setType("washer");
        washer.setBrand("Costco");
        washer.setColor("red");
        washer.setPrice(999);

        String washerInfo = washer.info();
        System.out.println(washerInfo);

        Appliance dryer = new Appliance("dryer", "LG", "silver", 1299);

        String dryerInfo = dryer.info();
        System.out.println(dryerInfo);


    }
}
