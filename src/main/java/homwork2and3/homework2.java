package homwork2and3;

import java.util.Arrays;

public class homework2 {
    public static void main(String[] args) {
        // 1. Create function `sum`
//        - which takes int[] as a param and returns sum of all elements of the array.
//        - invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result
        int[] numbers = {2,3,4,4,5};
        int sumOfNumbers = sum(numbers);
        System.out.println("#1 is " + sumOfNumbers);
//
//        2. Create function sort
//        - which takes  int[] as a param and print out sorted array invoke it from main()
//        - pass {3,9,1,8,4,8,5} as a param (this will be void func)

        int[] numbers2 = {3,9,1,8,4,8,5};
        System.out.println("#2 is " );
        sort(numbers2);

//        3. Create a function  which takes int[] as a param and returns min of the array invoke it from main() - pass {3,9,1,8,4,8,5} as a param
        int minOfArray = min(numbers2);
        System.out.println("#3 is " + minOfArray);
    }

    public static int sum(int[] numbers){
        int sum=0;
        for (int v:numbers)
        {
            int add= v;
            sum = sum + add;
        }
        return sum;
//        int sum =0;
//        if (int i = 0; i > allMynUMBERS[1-num.length];i++)
//
//            System.out.println(v);
//        }

    }

    public static void sort(int[] arr)
    {
        int index =0;
        int[] newArr = new int[index];
        index = arr.length-1;
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        for (int v :arr){
            System.out.println(v);
        }

    }
    public static int min(int[] numbers3)
    {
        int min = numbers3[0];
        for(int v:numbers3)
        {
            if (v < min)
            {
                min = v;
            }
        }
        return min;

    }
}

