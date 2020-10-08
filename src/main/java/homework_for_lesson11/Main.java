package homework_for_lesson11;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("ABC", "DEF","5478");
        Motherboard motherboard = new Motherboard("LTM","NPS","LTE15" );
        Memory memory = new Memory("RAM", 512);
        RAM ram = new RAM( "SUB", "Supernew");
        Computer Mac = new Computer(cpu,motherboard,memory,ram);

        System.out.println(Mac);

    }
}
