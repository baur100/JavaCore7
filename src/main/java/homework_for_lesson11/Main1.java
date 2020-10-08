package homework_for_lesson11;

public class Main1 {
    public static void main(String[] args) {
        Monitor retina = new Monitor("Retina",16.0,"led","new");
        Keyboard magic = new Keyboard( "Apple","black",14);
        RandomAccessMemory ram = new RandomAccessMemory( "Intel","Iris",12);
        Cooler vent = new Cooler( "Vent","paper",58,true);
        HardDrive core = new HardDrive ( "Int","Core",14,32);
        Laptop Mac = new Laptop(retina, magic,ram,vent,core);

        System.out.println(Mac);


    }
}
