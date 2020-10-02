package homework8;

public class Hw8 {
    public static void main(String[] args){
    int[] array1 = {2, 3, 5, 6, 7, 8};
    int[] array2 = {3, 9, 1, 8, 4, 8, 5};

    System.out.println("Below is homework 8:");
    int sumOfArray = sum(array1);
    System.out.println("Sum of array {2, 3, 5, 6, 7, 8} is " + sumOfArray + ".");

    sort(array2);

    int minNum = min(array2);
    System.out.println("Minimum number in the array {3, 9, 1, 8, 4, 8, 5} is " + minNum + ".");
    }

    public static int sum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static void sort(int[] array){
        int[] sortedArray = new int[array.length];
        int newMin = array[0];
        for (int i = 0; i < sortedArray.length; i++)
            for (int j = 0; j < array.length; j++) {
                if(newMin < array[j])

        }
    }

    public static int min(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] < min)
                min = array[i];
        return min;
    }
}
