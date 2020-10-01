package AEHWLesson8;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        //create an array with odd numbers only

//My way
        int[] arrX = {1, 6, 87, 54, 12, 53};
        int x = functionOddNumbers(arrX);
        System.out.println(x);

        int[] array = newArray(x, arrX);
        System.out.println(Arrays.toString(array));

//How it was in the class
        int[] arrayClass = functionOddNumbersClass(arrX);
        for (int v: arrayClass) {
            System.out.println(v);
        }
    }


    //My way
    public static int functionOddNumbers(int[] zz) {
        int oddCount = 0;
        for (int i = 0; i < zz.length; i++) {
            if (zz[i] % 2 == 1) {
                oddCount++;
            }
        }
        return oddCount;
    }

    public static int[] newArray(int a,int[] aa){
        int[] array = new int[a];
        int index = 0;
        for (int i=0; i<aa.length;i++){
            if(aa[i]%2==1){
                array[index] = aa[i];
                index++;
            }
        }
        return array;
    }

    //How it was in the class

    public static int[] functionOddNumbersClass (int[] zz) {
        int oddCount = 0;
        for (int v: zz) {
            if (v % 2 == 1) {
                oddCount++;
            }
        }

        int[] array = new int[oddCount];

        int index = 0;
        for (int v: zz){
            if(v%2==1){
                array[index] = v;
                index++;
                //or res[index++]=v;
            }
        }
        return array;
    }

}
