package L4;

public class App6 {
    public static void main(String[] args) {
        bye("Alex");
        bye("Anna");
    }

    private static void bye(String name) {
        System.out.println("====================");
        sayBye(name);
    }

    private static void sayBye(String name) {
        System.out.println("Bye " + name + " see you on the next lesson");
        lastLine();
    }

    private static void lastLine() {
        System.out.println("++++++++++++++");
    }
}