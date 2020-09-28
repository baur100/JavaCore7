package MyHomeworkQA;

public class Hw0926 {

    public static void sum(int p1, int p2){
        System.out.println(p1 + p2);
    }

    public static int sum2(int p1, int p2){
        return p1 + p2;
    }

    public static boolean isEven(int x1){
        return x1 % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Question 1:");
        sum(23,2);
        sum(8,3);
        sum(11, 32);
        System.out.println("\nQuestion 2:");
        int xx = sum2(12,9);
        int yy = sum2(89,27);
        int zz = sum2(19,42);
        System.out.print(xx+", "+yy+", "+zz);
        System.out.println("\n\nQuestion 3:");
        System.out.print(isEven(9)+", "+isEven(26)+", "+isEven(42)+", "+isEven(77));
    }
}
