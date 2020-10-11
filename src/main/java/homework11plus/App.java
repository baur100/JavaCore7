package homework11plus;

public class App {
    public static void main(String[] args){
        //1st computer
        Motherboard motherboard1 = new Motherboard("ASUS", "ROG MAXIMUS XII", "LGA 1200");
        Processor processor1 = new Processor("Intel","Core i9-10920X", 3.5);
        Storage storage1 = new Storage("Samsung", "870", 8, "SSD");
        Memory memory1 = new Memory("G.SKILL", 128, 2666);
        Powersupply powersupply1 = new Powersupply("Corsair", "RM850x", 850);
        Keyboard keyboard1 = new Keyboard("SteelSeries", "Apex Pro", "Wired", "Mechanical");
        Mouse mouse1 = new Mouse("Logitech","G502", "wireless");
        Monitor monitor1 = new Monitor("GIGABTE", "G270QC", 27, 165);

        SystemBlock system1 = new SystemBlock(motherboard1, processor1, storage1, memory1, powersupply1);
        Computer computer1 = new Computer(system1, keyboard1, mouse1, monitor1);

        //2nd computer
        Motherboard motherboard2 = new Motherboard("MSI", "B450 GAMING", "AM4");
        Processor processor2 = new Processor("AMD", "Ryzen 5 3600", 3.6);
        Storage storage2 = new Storage("WD", "Red Plus", 4, "HDD");
        Memory memory2 = new Memory("Crucial", 16, 2666);
        Powersupply powersupply2 = new Powersupply("Rosewill", "ARC-550", 550);
        Keyboard keyboard2 = new Keyboard("HP", "K1500", "Wired", "membrane");
        Mouse mouse2 = new Mouse("Logitech", "M100", "Wired");
        Monitor monitor2 = new Monitor("Acer", "K202HQL", 19.5, 60);

        SystemBlock system2 = new SystemBlock(motherboard2, processor2, storage2, memory2, powersupply2);
        Computer computer2 = new Computer(system2, keyboard2, mouse2, monitor2);

        String computerOneInfo = computer1.pullComputerInfo();
        String computerTwoInfo = computer2.pullComputerInfo();

        System.out.println("Computer #1:");
        System.out.println(computerOneInfo);
        System.out.println("Computer #2:");
        System.out.println(computerTwoInfo);
    }
}
