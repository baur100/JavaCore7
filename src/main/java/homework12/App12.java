package homework12;

public class App12 {
    public static void main(String[] args) {

        ElectricKettle myKettle = new ElectricKettle("LG", 40);
        ElectricKettle hisKettle = new ElectricKettle("Philips", 35);

        Oven myOven = new Oven("Cuisinart", 599);
        Oven hisOven = new Oven("Samsung", 750);

        HasManual withManual1 = myKettle;
        HasManual withManual2 = hisOven;

        System.out.println(withManual1.getInstructions());
        System.out.println(withManual2.getInstructions());
    }
}
