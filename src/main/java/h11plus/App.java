package h11plus;


public class App {
    public static void main(String[] args) {
//        Computer computer1;
//        Computer computer2;
//        computer1 = new Computer("Stan Computer");
//        computer2 = new Computer("Jon Laptop");

        Keyboard device1 = new Keyboard("M570","Logitech",true );
        Monitor device2 = new Monitor("1500R", "MonopricePro", "E2020H", "Dell", true );
        Mouse device3 = new Mouse("M607","Redragon",false);
        SystemBlock device4 = new SystemBlock("CPU","Core 17", "Intel");


//        String computer1 = device1.getKeyboard().getMonitor().getHouse().getSystemBlock;
//        System.out.println(computer1);

    }

}
