package Lesson8;

public class index2 {
    public static void main(String[] args) {
        int[] arr = {1,5,2,7,4,2};

        int[] oddNum = isOdd(arr);
        for (int v : oddNum) {
            System.out.println(v);
        }
    }

    public static int[] isOdd(int[] arr) {
        int count = 0;
        for (int v : arr) {
            if (v%2 != 0) {
                count++;
            }
        }
        int[] res = new int[count];
        int index = 0;
        for (int v : arr) {
            if (v%2 !=0) {
                res[index++] = v;
            }
        }
        return res;
    }
}
