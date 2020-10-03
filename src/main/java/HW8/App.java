package HW8;
// 1. Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
// invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result
// 2. Create function sort - which takes  int[] as a param and print out sorted array invoke it from main() - pass {3,9,1,8,4,8,5} as a param (this will be void func)
// 3. Create a function  which takes int[] as a param and returns min of the array invoke it from main() - pass {3,9,1,8,4,8,5} as a param
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



