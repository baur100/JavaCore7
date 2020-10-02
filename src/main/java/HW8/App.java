package HW8;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 6, 7, 8};
        int sumOfArray = sum(arr1);
        System.out.println(sumOfArray);
        int[] arr2 = {3, 9, 1, 8, 4, 8, 5};
        int minValue = arrayMin(arr2);
        System.out.println(minValue);
        sort(arr2);

    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int v : arr) {
            sum = sum + v;
        }
        return sum;
    }

    public static int arrayMin(int[] arr) {
        int min = arr[0];
        for (int v : arr) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    int v = arr[j];
                    arr[j] = arr[i];
                    arr[i] = v;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}



