package lesson7;

public class Stan7 {
    public static void main(String[] args) {
        int[] array = {2,3,8,12,44};
        int sumOfArray = sumOfArray(array);
        System.out.println(sumOfArray);
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int v : array) {
            sum += v;
        }
        return sum;
    }
}
