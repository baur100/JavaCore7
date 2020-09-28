package L4;

public class App4 {
    public static void main(String[] args) {
        int[] z = {1, 4, 1, 3};
        int[] a = {1};
        int[] w = {-1, -4, -6, -7};
        printArrayMax(z);
        printArrayMax(a);
        printArrayMax(w);
//        App.hello();
    }

    public static void printArrayMax(int[] aaa) {
        int max = aaa[0];
        for (int v : aaa) {
            if (v > max) {
                max = v;
            }
        }
        System.out.println(max);
    }
}
