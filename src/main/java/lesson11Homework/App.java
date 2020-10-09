package lesson11Homework;

public class App {

    public static void main ( String[]args){


        BuildComputer myComputer1 = new BuildComputer("Desktop","DELL",800);
        myComputer1.printComputer();


        BuildComputer myComputer2 = new BuildComputer("Laptop","Apple",750);
        myComputer2.printComputer();


        HardDrive myHardDrive1 = new HardDrive("GTX 1050 ","Geforce", 300);
        myHardDrive1.printHardDrive();

        HardDrive myHardDrive2 = new HardDrive("RTX 2060 ","NVIDIA", 250);
        myHardDrive2.printHardDrive();


        Keyboard myKeyboard1 = new Keyboard("Wired","Logitec ", 30);
        myKeyboard1.printKeyboard();

        Keyboard myKeyboard2 = new Keyboard("Wireless Bluetooth","Microsoft", 40);
        myKeyboard2.printKeyboard();

        Mouse myMouse1 = new Mouse("Wired","Logitec", 30);
        myMouse1.printMouse();

        Mouse myMouse2 = new Mouse("Wireless Bluetooth","Microsoft", 25);
        myMouse2.printMouse();


    }
}
