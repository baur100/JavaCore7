package hw11plus;

public class App {
    public static void main(String[] args) {
        Motherboard msi = new Motherboard("MSI", "LGA 1200");
        Processor i7 = new Processor("Intell", "Core i7", 6, 3.4);
        Memory ddr4 = new Memory("Samsung", "DDR4", 16, 1300);
        GraphicCard nvidia = new GraphicCard("NVidia", "GeForce RTX 2080");
        Storage ssd500 = new Storage("Samsung", "SSD", 500);

        Motherboard asus = new Motherboard("Asus", "AM4");
        Processor ryzen7 = new Processor("AMD", "Ryzen 7", 6, 2.6);
        Memory ddr3 = new Memory("Gigabyte", "DDR3", 16, 1300);
        GraphicCard radeon = new GraphicCard("AMD", "Radeon RX 5600XT");

        Computer pc1 = new Computer(msi, i7, ddr4, nvidia, ssd500);
        Computer pc2 = new Computer(asus, ryzen7, ddr3, radeon, ssd500);

        System.out.println(pc2.getStorage().getBrand());
    }
}
