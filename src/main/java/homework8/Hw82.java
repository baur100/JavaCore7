package homework8;

public class Hw82 {

    static int min(int[] arr) {
        int min = arr[0];
        for( int i =0; i <arr.length; i++) {

            if (arr[i] < min) {
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String args[]){
        int[] arr = {3,9,1,8,4,8,5};
        System.out.println("Minimum of the array is " +min(arr));
    }

}
