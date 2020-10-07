package Lesson10Homework;

public class App {
    public static void main(String[]args){
        //this below is the object of CellPhones Class
        System.out.println(" Here is Cell Phones Class ------------------------------------------------");
        CellPhones smartPhone = new CellPhones();
        smartPhone.setBrand("Apple, iPhone");
        smartPhone.setGeneration("5th Generation");
        smartPhone.setMemory("128");
        smartPhone.setModel(10);
        smartPhone.setPrice(1200);
        smartPhone.printCellPhones();

        System.out.println("----    -------    ----------     ----------     ---------     --------");

        CellPhones myCellPhone = new CellPhones("Samsung"," Edge","128", 20,1200 );
        myCellPhone.printCellPhones();

        System.out.println("\n Here is Computer Class ------------------------------------------------");

        //this below is the object of Computers Class

        Computers myComputers = new Computers();
        myComputers.setBrand("MicroSoft");
        myComputers.setType("Windows 10 DeskTop");
        myComputers.setMemory("128 GB");
        myComputers.setPrice(1330);
        myComputers.setProcessor(3202);
        myComputers.printComputers();

        System.out.println("----    -------    ----------     ----------     ---------     --------");

        Computers officeComputers = new Computers ("Apple", "Mc Book Pro", " 500 GB", 1330, 3200);
        officeComputers.printComputers();

        System.out.println("\n Here is Handheld Devices Class ------------------------------------------------");

        //this below is the object of Computers Class

        HandheldDevices myDevices = new HandheldDevices();
        myDevices.setBrand("Samsung");
        myDevices.setGeneration("Chrome Pad");
        myDevices.setMemory("\n 128 GB");
        myDevices.setPrice(330);
        myDevices.setModel(3);
        myDevices.printHandheldDevices();

        System.out.println("----    -------    ----------     ----------     ---------     --------");

        HandheldDevices newDevices = new HandheldDevices ("Apple", "iPad Pro", "\n 256 GB", 830, 4);
        newDevices.printHandheldDevices();

        System.out.println("\n Here is Television Class ------------------------------------------------");

        Televisions myTelevison = new Televisions();
        myTelevison.setBrand("Samsung");
        myTelevison.setType("Smart LED TV");
        myTelevison.setPrice(1900);
        myTelevison.setInches(80);
        myTelevison.setResolution("8K");
        myTelevison.printTelevisions();

        System.out.println("----    -------    ----------     ----------     ---------     --------");

        Televisions ourTelevision = new Televisions("Panasonic", "Smart TV", 1600, 75, "4K");
        ourTelevision.printTelevisions();


    }

}
