package L4;

public class App1 {
    public static void main(String[] args) {
        hello();
        hello();
        hi("Peter");
        introduce("Anna", "Peter");
        introduce("Peter", "Jane");
    }

    public static void hi(String name) {
        hello();
        System.out.println("-------------------------------------");
        System.out.println("Hello Mr/Ms " + name + " today is a wonderful day");
        System.out.println("-------------------------------------");
    }

    public static void hello() {
        System.out.println("===========================");
        System.out.println("Hello, today is a beautiful day");
        System.out.println("===========================");
    }

    public static void introduce(String name1, String name2) {
        System.out.println(name1 + ", let me introduce you to " + name2);
    }
}

