package hw8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework8 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8};
        int[] arr1 = {3,9,1,8,4,8,5};
        int[] arr2 = {3,9,1,8,4,8,5};

        System.out.println("Sum: " + sum(arr) );

        sort(arr1);

        System.out.println("Minimum: " + min(arr2) );
    }
//  1. Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
//  invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result
    public static int sum(int[] arr) {
        int result = 0;
        for (int v : arr) {
            result += v;
        }
        return result;
    }

//  2. Create function sort - which takes  int[] as a param and print out sorted array invoke it from main()
//  - pass {3,9,1,8,4,8,5} as a param (this will be void func)
    public static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String result = "";
        for (int v : arr) {
            result += v + " ";
        }
        System.out.println("Sorted: " + result);
    }
//  3. Create a function  which takes int[] as a param and returns min of the array invoke it from main()
//  - pass {3,9,1,8,4,8,5} as a param
    public static int min(int[] arr) {
        int temp = arr[0];
        for (int v : arr) {
            if (v < temp) {
                temp = v;
            }
        }
        return temp;
    }
}
