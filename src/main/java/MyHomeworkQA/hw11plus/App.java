package MyHomeworkQA.hw11plus;

public class App {

    public static void main(String[] args) {

        SystemBlock sys1 = new SystemBlock("Intel", "Eldorado", 4);
        Mouse mou1 = new Mouse("X11", "Compaq", true);
        Keyboard key1 = new Keyboard("HP", true);
        Monitor mont = new Monitor("Core 24'","ViewSonic",false);

        SystemBlock sys2 = new SystemBlock("AMD", "Advantage", 8);
        Mouse mou2 = new Mouse("WA 237", "Razer", false);
        Monitor mont2 = new Monitor("Widescreen 32'","Dell",false);

        Computer comp1 = new Computer(2001, "XACD90926371", "Zennox",sys1,key1,mou1,mont);

        Computer comp2 = new Computer(2008, "SSCP02934662", "IBM",sys2,key1,mou2,mont2);

        String monitorBrand = comp1.getMonitor().getBrand();
        System.out.println(monitorBrand+"\n");
        String keybdInfo = comp2.getKeyboard().showInfo();
        System.out.println(keybdInfo+"\n");

        String comp1Info = comp1.displayFullInfo();
        String comp2Info = comp2.displayFullInfo();

        System.out.println(comp1Info);
        System.out.println(comp2Info);
    }
}
