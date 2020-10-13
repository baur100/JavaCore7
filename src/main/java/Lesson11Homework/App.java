package Lesson11Homework;

public class App {
    public static void main(String[] args) {
        System.out.println("This is the 1st Super Class of Computer Manufacture---------------------------------------------------------");
        ComputerManufacture IBM = new ComputerManufacture("Desktop", "IBM", 899);
        IBM.printComputerManufacture();

        HardDrive Seagate = new HardDrive(" HardDrive is Solid State ", "Made by Seagate \n and HD cost is $  ", 120, 500, " Internal");
        Seagate.printHardDrive();

        Memory Ram = new Memory("Random Access Memory ", " Made by Seagate and the cost is $ ", 60, 128, " SDRAM");
        Ram.printMemory();

        MotherBoard Standard = new MotherBoard("Standard ATX ", " Intel", 190, " 305*244mm (length*breadth)", " Extended ATX motherboards");
        Standard.printMotherBoard();

        PowerSupply Ryzen = new PowerSupply("631 watts,", " Nvidia", 40, 120, 12);
        Ryzen.printPowerSupply();

        Processor Intel = new Processor(" Standard ATX", " Intel", 110, " Pentium", 3200);
        Intel.printProcessor();

        System.out.println("This is the 2nd Super Class of Computer Manufacture---------------------------------------------------------");
        ComputerManufacture Dell = new ComputerManufacture("Laptop", "Dell", 699);
        Dell.printComputerManufacture();

        HardDrive Hitachi = new HardDrive(" HardDrive is Solid State  ", "Made by AMD \n and HD cost is $  ", 90, 1000, " Internal");
        Hitachi.printHardDrive();

        Memory myRam = new Memory("Random Access Memory ", " Made by Logic care and the cost is $ ", 90, 128, " DRAM");
        myRam.printMemory();

        MotherBoard ExStandard = new MotherBoard("Advanced ATX ", " GTX", 200, " 105*144mm (compact)", " Extended ATX motherboards");
        ExStandard.printMotherBoard();

        PowerSupply myRyzen = new PowerSupply("631 watts,", " Nvidia", 60, 120, 12);
        myRyzen.printPowerSupply();

        Processor AMD = new Processor(" MicroProcessor", " Intel", 110, " Athlon", 2800);
        AMD.printProcessor();
    }

}

