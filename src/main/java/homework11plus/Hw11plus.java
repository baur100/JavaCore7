package homework11plus;

public class Hw11plus {
    public static void main(String[] args) {
        Mouse myMouse = new Mouse("M705", "Logitech", "wired" );
        Mouse hisMouse = new Mouse ("Mobile Mouse 3600", "Microsoft", "wireless");
        SystemBlock myProcessor = new SystemBlock("Intell", "Core i5-10600K", "x86", "64 bits");
        SystemBlock hisProcessor = new SystemBlock("Intell", "Core 2 Duo", "risc", "64 bites");
        Keyboard myKeyboard = new Keyboard("Apple", "Magic Keyboard", "Extended");
        Keyboard hisKeyboard = new Keyboard("Razer", "Pro Type", "Bluetooth Keyboard");
        Monitor monitor1 = new Monitor( "Dell", "P2720DC", 27);
        Monitor monitor2 = new Monitor( "Acer", "A234mv", 24);
        Monitor monitor3 = new Monitor("Dell", "S2319H", 23);
        Monitor monitor4 = new Monitor("Samsung", "CJ791 C34J791WTN", 34);
        Computer myComputer = new Computer(myProcessor, myKeyboard, myMouse, new Monitor[]{monitor1, monitor2});
        Computer hisComputer = new Computer(hisProcessor, hisKeyboard, hisMouse, new Monitor[]{monitor3, monitor4});

        System.out.println(myComputer.getDescription());
        System.out.println(hisComputer.getDescription());

    }
}
