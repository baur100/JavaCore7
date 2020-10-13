package lesson16;

public class App {
    public static void main(String[] args) {
        Helper helper = new Helper("Weird name");
        Helper.printRandomNumber();
        hello();
    }

    public static void hello(){
        System.out.println("Hello");
    }

}
