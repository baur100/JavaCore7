package h11plus;


public class App1 {
    public static void main(String[] args) {
        Monitor myMonitor = new Monitor(17, "LG", "453", 2018);
        Monitor myMonitor2 = new Monitor(21,"Dell","45454", 2018);
        Monitor myMonitor3 = new Monitor(32,"Samsung","423D",2028);
        Monitor[] monitorList ={myMonitor,myMonitor2,myMonitor3};

        Keyboard myKeyboard = new Keyboard(true, "logitech", "TV56");
        Mouse myMouse = new Mouse("Gf45", "hp", true);
        SystemBlock mySystemBlock = new SystemBlock("Asus", "intel I5", 1000, 512, 256);

    Computer computer = new Computer(mySystemBlock,myKeyboard,myMouse,monitorList);
        System.out.println(computer.toString());
    }

}

