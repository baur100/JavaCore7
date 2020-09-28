package hw7;

public class Homework {
    public static void main(String[] args) {
        System.out.println("================task1==================");
        sum(1,3);
        sum(108,46);
        sum(29,34);

        System.out.println("================task2==================");

        int s1 = sum2(8,893);
        int s2 = sum2(6,48);
        int s3 = sum2(4,25);
        System.out.println("s1: " + s1 + "\ns2: " + s2 + "\ns3: " + s3);

        System.out.println("================task3==================");
        int[] nums = {2,4,5,9};
        for (int v : nums) {
            System.out.println("-Is " + v + " even? \n-" + isEven(v));
        }
    }
//        1. Create a new function `sum` - it takes in 2 params (int, int) and print out result of their sum
//          (hint - this is void function - it not returns anything - just print on screen) - invoke it 3 times
//          with different params
    public static void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
//        2. Create a new function `sum2` - it takes in 2 params (int, int) and returns their sum.
//        Invoke it 3 times with different params. Save a result in a variable. print out variavle
//        (hint - returning type - int)
    public static int sum2(int num1, int num2) {
        return num1 + num2;
    }
//        3. Create function `isEven` - int takes an int as an argument and return true if it is even
//        or false if it is odd invoke it with 4 different params - print out results
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
