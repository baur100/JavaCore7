package homework10;

public class App {
    public static void main(String[] args){
        //Employee class
        Employee bud = new Employee();
        bud.setFirstName("Bud");
        bud.setLastName("Light");
        bud.setYearJoined(2015);
        bud.setIsCurrentEmployee(true);
        Employee maria = new Employee("Maria", "Amazing", 2008, false);

        bud.printInfo();
        maria.printInfo();

        String budInfo = bud.pullEmployeeInfo();
        System.out.println(budInfo);
        String sashaInfo = maria.pullEmployeeInfo();
        System.out.println(sashaInfo);

        //Cat class
        Cat fluffy = new Cat();
        fluffy.setName("Fluffy");
        fluffy.setBreed("Persian Longhair");
        fluffy.setAge(10);
        fluffy.setColor("grey");
        Cat mimi = new Cat("Mimi", "Domestic Shorthair", 6, "orange");

        fluffy.printInfo();
        mimi.printInfo();

        String spinarakInfo = fluffy.getCatInfo();
        System.out.println(spinarakInfo);
        String mimiInfo = mimi.getCatInfo();
        System.out.println(mimiInfo);

        //Vehcile class
        Vehicle challenger = new Vehicle();
        challenger.setBrand("Dodge");
        challenger.setModel("Challeger");
        challenger.setYear(2010);
        challenger.setMpg(17.0);
        Vehicle outback = new Vehicle("Subaru", "Outback", 2017, 25.0);

        challenger.printInfo();
        outback.printInfo();

        String challengerInfo = challenger.pullVehicleInfo();
        System.out.println(challengerInfo);
        String outbackInfo = outback.pullVehicleInfo();
        System.out.println(outbackInfo);

        //Song class
        Song beautifulDay = new Song();
        beautifulDay.setName("Beautiful Day");
        beautifulDay.setArtist("U2");
        beautifulDay.setAlbum("All That You Can't Leave Behind");
        beautifulDay.setLength(246);
        Song somethingAboutUs = new Song("Something About Us", "Daft Punk", "Discovery", 352);

        beautifulDay.printInfo();
        somethingAboutUs.printInfo();

        String beautifulDayInfo = beautifulDay.showSongInfo();
        System.out.println(beautifulDayInfo);
        String somethingAboutUsInfo = somethingAboutUs.showSongInfo();
        System.out.println(somethingAboutUsInfo);
    }
}