package MyHomeworkQA.HwFarm;

public class App {

    public static void main(String[] args) {

        Address montAddr = new Address("30075 Williams Montague Road", "Splendora",
                "TX", 78405);

        Farm willmont = new Farm("Montague's Chicken And More", montAddr);

        willmont.addCropToFarm(new Agricultural("Maize", 84));
        willmont.addCropToFarm(new Agricultural("Soybean", 122));
        willmont.addCropToFarm(new Agricultural("Yam", 48));
        willmont.addCropToFarm(new Agricultural("Carrots", 65));

        willmont.addCattleToFarm(Cattle.COWS, 17);
        willmont.addCattleToFarm(Cattle.CHICKENS, 264);
        willmont.addCattleToFarm(Cattle.SHEEP, 21);
        willmont.addCattleToFarm(Cattle.DONKEYS, 7);
        willmont.addCattleToFarm(Cattle.PIGS, 28);
        willmont.addCattleToFarm(Cattle.TURKEYS, 11);

        System.out.println(willmont.printInfo());

    }
}
