package hw11plus;


public class App {
    public static void main(String[] args) {

        Keyboard device1 = new Keyboard("M570","Logitech",true );
        Mouse device3 = new Mouse("M607","Redragon",false);
        Cpu processor = new Cpu("CPU","Core 17", 350);
        Disk disk = new Disk("M236", "Logitech", 250);
        Motherboard motherboard = new Motherboard("148R", "InfoSec");

        Monitor monitor = new Monitor("1500R", "MonopricePro", true );
        Monitor monitor1 = new Monitor("E2020H", "Dell", false );
        Monitor monitor2 = new Monitor("E2021D", "Dell", true );

        Monitor[] monitors = {monitor, monitor1, monitor2};


        SystemBlock system = new SystemBlock(motherboard, disk, processor);
        Computer computer1 = new Computer(system, device1, device3, monitors);

        Computer computer2 = new Computer();
        computer2.setKeyboard(device1);
        computer2.setMouse(device3);
        computer2.setProcessor(system);


        System.out.println(computer1.toString());
        System.out.println("\n------------------");
        System.out.println(computer2.toString());




    }

}
