package MyHomeworkQA.lesson10hw;

public class App {

    public static void main(String[] args) {
        Journal jj = new Journal(true, "This is my birthday! Happy happy joy joy.","Gruff");
        jj.printJournal();

        Journal rr = new Journal();
        rr.setSecret(false);
        rr.setText("Delta, alpha, radio, mayday, mayday, foxtrot, zulu, tango!");
        rr.setOwner("Lanre");
        rr.printJournal();

        System.out.println("||||||||||||||||||||||||");

        Card unique = new Card('7', "Hearts");
        System.out.println(unique.printCard());

        Card you = new Card();
        you.setValue('4');
        you.setSuit("Clubs");
        System.out.println(you.printCard());

        System.out.println("||||||||||||||||||||||||");

        Bus clown = new Bus();
        clown.setDriverName("Bobo");
        clown.setType("Clown Tank");
        clown.setSeats(6);
        System.out.println(clown.showTheBus());

        Bus school = new Bus("Schoolbus", 30, "Franklin");
        System.out.println(school.showTheBus());

        System.out.println("||||||||||||||||||||||||");

        Jet gulf = new Jet("Gulstream", 28.0, 12, true);
        gulf.displayJetInfo();

        Jet jumbo = new Jet();
        jumbo.setCapacity(158);
        jumbo.setInFlight(false);
        jumbo.setWingspan(375.930);
        jumbo.setModel("Airbus A30");
        jumbo.displayJetInfo();
    }
}
