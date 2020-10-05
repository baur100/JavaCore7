package aehwlesson11;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        String[] mm = {"HP", "Dell"};

        SystemBlock processor1 = new SystemBlock("AA");
        Keyboard keyboard1 = new Keyboard("HP", "BB", true);
        Mouse mouse1 = new Mouse("HP", "CC", false);
        Monitors monitor1 = new Monitors("HP", mm);

        SystemBlock processor2 = new SystemBlock("AAaa");
        Keyboard keyboard2 = new Keyboard("Dell", "BBbb", true);
        Mouse mouse2 = new Mouse("HP", "CCcc", false);
        Monitors monitor2 = new Monitors("HP", new String[]{"someM1", "someM2", "someM3"});

        Computer comp1 = new Computer(processor1, keyboard1, mouse1, monitor1);

        Computer comp2 = new Computer(processor2, keyboard2, mouse2, monitor2);


        String comp1Keyboard = comp1.getKeyboard().getBrand();

        System.out.println(comp1Keyboard);

        System.out.println("==========================");

        boolean comp1MouseWireless = comp1.getMouse().isMouseWireless;

        System.out.println("comp1 mouse is wireless: " + comp1MouseWireless);

        System.out.println("==========================");

        String[] mmm = comp2.getMonitors().monitorsModel;

        System.out.println(Arrays.toString(mmm));

        System.out.println("==========================");

        String z = comp2.getMouse().getBrand();
        String y = comp2.getKeyboard().getBrand();

        if (z == y){
            System.out.println("Same brand");
        }else System.out.println("Different brand");
    }
}
