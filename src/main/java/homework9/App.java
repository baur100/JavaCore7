package homework9;

public class App {
    public static void main(String[] args){
        Employee kenny = new Employee();  // Employee class
        kenny.firstName = "Kenny";
        kenny.lastName = "Love";
        kenny.yearJoined = 2001;
        kenny.currentEmplyee = true;

        Employee sarah = new Employee();
        sarah.firstName = "Sarah";
        sarah.lastName = "Connor";
        sarah.yearJoined = 1984;
        sarah.currentEmplyee = false;

        kenny.introdue();
        sarah.introdue();

        String kennInfo = kenny.getEmployeeInfo();
        System.out.println(kennInfo);

        String sarahInfo = sarah.getEmployeeInfo();
        System.out.println(sarahInfo);

        Dog lucus = new Dog();      // Dog class
        lucus.name = "Lucus";
        lucus.breed = "Golden Retriver";
        lucus.age = 3;
        lucus.color = "yellow";

        Dog beyonce = new Dog();
        beyonce.name = "Beyonce";
        beyonce.breed = "Shiba Inu";
        beyonce.age = 5;
        beyonce.color = "black";

        lucus.summonDog();
        beyonce.summonDog();

        String locusInfo = lucus.getDogInfo();
        System.out.println(locusInfo);

        String bibiInfo = beyonce.getDogInfo();
        System.out.println(bibiInfo);

        Song chiquitita = new Song();     // Song class
        chiquitita.name = "Chiquitita";
        chiquitita.artist = "ABBA";
        chiquitita.album = "ABBA Gold";
        chiquitita.length = 325;

        Song fixYou = new Song();
        fixYou.name = "Fix You";
        fixYou.artist = "Coldplay";
        fixYou.album = "X&Y";
        fixYou.length = 295;

        chiquitita.playSong();
        fixYou.playSong();

        String chiquititaInfo = chiquitita.getSongInfo();
        System.out.println(chiquititaInfo);

        String fixYouInfo = fixYou.getSongInfo();
        System.out.println(fixYouInfo);

        Meat beef = new Meat();        // Meat class
        beef.type = "beef";
        beef.from = "cattle";
        beef.dollarPerPound = 4.26;

        Meat port = new Meat();
        port.type = "pork";
        port.from = "pig";
        port.dollarPerPound = 4.99;

        beef.buyMeat();
        port.buyMeat();

        String getBeefInfo = beef.getMeatInto();
        System.out.println(getBeefInfo);

        String getPorkInfo = port.getMeatInto();
        System.out.println(getPorkInfo);
    }
}
