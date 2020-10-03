package AEHWLesson8;

import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
//        1. Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
//                invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result
//        2. Create function sort - which takes  int[] as a param and print out sorted array invoke it from main()
//        - pass {3,9,1,8,4,8,5} as a param (this will be void func)
//        3. Create a function  which takes int[] as a param and returns min of the array invoke it from main()
//        - pass {3,9,1,8,4,8,5} as a param

    int[] arrayX = {2,3,5,6,7,8};
    int sumOfArray = sum(arrayX);
        System.out.println(sumOfArray);

    int[] arrayY = {3,9,1,8,4,8,5};
    int minValue = arrayMin(arrayY);
        System.out.println(minValue);

    sort(arrayY);
    sortA(arrayY);
    bubbleSort(arrayY);


    }

    public static int sum(int[] arr) {
        int sum = 0;
        for(int v: arr){
            sum = sum+v; // sum+=v;
        }
        return sum;
    }

    public static int arrayMin(int[] arr) {
        int min = arr[0];
        for (int v: arr) {
            if (v< min){
                min=v;
            }
        }
        return min;
    }

    private static void sort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
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


    public static void sortA(int[] array){
        Arrays.sort(array);
        for (int v:array){
            System.out.println(v);
        }
    }

    public static void bubbleSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        for(int v: array){
            System.out.println(v);
        }
    }



}




