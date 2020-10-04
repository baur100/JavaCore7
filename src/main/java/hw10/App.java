package hw10;

public class App {
    public static void main(String[] args) throws Exception {
//        Phone Class
        Phone s10 = new Phone();
        Phone i11pro = new Phone();

        s10.setBrand("Samsung");
        s10.setModel("Galaxy S10");
        s10.setYear(2019);
        s10.setStorage(64);

        i11pro.setBrand("Apple");
        i11pro.setModel("iPhone 11 pro");
        i11pro.setYear(2019);
        i11pro.setStorage(128);

//        System.out.println(s10.getBrand());


//        Grocery Class
        Grocery[] apple = {
                new Grocery("Fuji", true, 1.99),
                new Grocery("Honey Moon", false, 2.99)
        };
        apple[1].updatePrice(2.69);
        apple[1].setAvailable(true);

//        System.out.println(apple[1].getAvailable());

//        MOVIE CLASS
        Movie avengers = new Movie("The Avengers", 2012, 8.0, 50);
        Movie ironman = new Movie("Iron Man", 2008, 7.9, 470);

        avengers.addRating(10);
//        System.out.println("Rating: " + avengers.getRating() + " | " + avengers.getRaters());

//        SKILL CLASS
        Skill[] dev = {
                new Skill("HTML/CSS", 5),
                new Skill("JavaScript", 4),
                new Skill("PHP", 3)
        };

//        System.out.println("Skills: ");
//        for (Skill v : dev) {
//            System.out.println("\t" + v.getSkillName() + " " + v.getYears() + " years");
//        }

//        print info for each class
        s10.printInfo();
        apple[0].printInfo();
        avengers.printInfo();
        dev[1].printInfo();
    }
}
