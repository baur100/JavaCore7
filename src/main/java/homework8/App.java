package homework8;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int [] array = {2,2,4,5,7,1};
        int sumOfArray = sumOfArray(array);
        System.out.println(sumOfArray);

//        sortArray(array);

        int min = minOfArray(array);
        System.out.println(min);

        bubbleSort(array);
    }
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        for (int v : arr) {
            System.out.println(v);
        }
    }

    private static int minOfArray(int[] array) {
        int min = array[0];
        for (int v : array){
            if(v<min){
                min=v;
            }
        }
        return min;
    }

    private static void sortArray(int[] array) {
        Arrays.sort(array);
        for (int v:array){
            System.out.println(v);
        }
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int v: array){
            sum+=v; // sum = sum + v
        }
        return sum;
    }

}
