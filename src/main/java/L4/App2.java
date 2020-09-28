package L4;

public class App2 {
    public static void main(String[] args) {
        int[] xx = {2, 2, 3};
        summOfArray(xx);
        int[] xx1 = {2, 4, 5, 6, 2, 2, 3};
        summOfArray(xx1);
    }

    public static void summOfArray(int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum = sum + v;
        }
        System.out.println(sum);
    }
}