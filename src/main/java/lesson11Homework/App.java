package lesson11Homework;



public class App {

    public static void main ( String[]args){

        BuildComputer myComputer1 = new BuildComputer("Desktop","DELL",800);
        myComputer1.printComputer();

        GraphicsCard myGraphicsCard1 = new GraphicsCard(" MDX 1400","Geforce",300,5);
        myGraphicsCard1.printGraphicsCard();

        HardDrive myHardDrive1 = new HardDrive("GTX 1050 ","Geforce", 400);
        myHardDrive1.printHardDrive();

        Keyboard myKeyboard1 = new Keyboard("Wired","Logitec ", 50);
        myKeyboard1.printKeyboard();

        Mouse myMouse1 = new Mouse("Wired","Logitec", 50);
        myMouse1.printMouse();

        System.out.println("---------------------------------------------------------------------");

     //--------------------------------------------------------------------------------------------------------------//

        BuildComputer myComputer2 = new BuildComputer("Laptop","Apple",750);
        myComputer2.printComputer();


        GraphicsCard myGraphicsCard2 = new GraphicsCard(" RC 450","Intel",400,8);
        myGraphicsCard2.printGraphicsCard();


        HardDrive myHardDrive2 = new HardDrive("RTX 2060 ","NVIDIA", 250);
        myHardDrive2.printHardDrive();


        Keyboard myKeyboard2 = new Keyboard("Wireless Bluetooth","Microsoft", 50);
        myKeyboard2.printKeyboard();


        Mouse myMouse2 = new Mouse("Wireless Bluetooth","Microsoft", 50);
        myMouse2.printMouse();

    }
}
