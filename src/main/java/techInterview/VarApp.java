package techInterview;

public class VarApp {
    public static void main(String[] args) {
        int a = 15;
        int b = 17;

//        int c = b;
//        b = a;
//        a = c;

        a += b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
