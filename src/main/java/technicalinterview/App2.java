package technicalinterview;

public class App2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 33;

        int c = remainder1(a,b);
        System.out.println(c);
    }

    private static int remainder(int a, int b) {
        while(a>=b){
            a=a-b;
        }
        return a;
    }
    private static int remainder1(int a, int b) {
        int c = a/b;
        return a-c*b;
    }
}
