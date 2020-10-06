package HW8;

import java.util.Arrays;

public class Hw8 {
    public static void main(String[] args) {
        int[]xx = {2,3,5,6,7,8};
        sum(xx);

        int[] xx1 = {3,9,1,8,4,8,5};
        sortorder(xx1);

       int[]xx2 = {3,9,1,8,4,8,5};
       printArraymin(xx2);


     }

    public static void sum(int[] arr){
        int sum=0;
        for (int v: arr){
            sum=sum+v; //sum = sum + v  sum+=v
        }
        System.out.println(sum);
           }

    public static void sortorder(int[] arr2){
        Arrays.sort(arr2);

               System.out.println(Arrays.toString(arr2));

    }

        public static void printArraymin(int[] arr3){
            int min= arr3[0];
            for (int v: arr3){
            if(v<min){
                min = v;
                }
             }
        System.out.println(min);
}
}
