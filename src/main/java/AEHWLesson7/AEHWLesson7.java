package AEHWLesson7;

public class AEHWLesson7 {
    /*1. Create a new function `sum` - it takes in 2 params (int, int) and print out result of their sum
    (hint - this is void function - it not returns anything - just print on screen) - invoke it 3 times with different params
    2. Create a new function `sum2` - it takes in 2 params (int, int) and returns their sum.
        Invoke it 3 times with different params. Save a result in a variable. print out variavle (hint - returning type - int)
    3. Create function `isEven` - int takes an int as an argument and return true if it is even or false if it is odd
        invoke it with 4 different params - print out results*/
    public static void main(String[] args) {

        sum(4, 6);
        sum(40, 60);
        sum(400, 600);



        int x = sum2(8, 12);
        int y = sum2(80, 120);
        int z = sum2(800, 1200);
        System.out.println("sum2= " + x);
        System.out.println("sum2= " + y);
        System.out.println("sum2= " + z);



        boolean xx = isEven(1);
        boolean yy = isEven(22);

        int zz = sum2(50,51);
        boolean zzz = isEven(zz);


        int[] q = {1,2,3,4};
        int qq = arraySum(q);
        boolean qqq = isEven(qq);

        System.out.println("Is xx even? - " + xx);
        System.out.println("Is yy even? - " + yy);
        System.out.println("Is zz even? - " + zzz);
        System.out.println("Is qq even? - " + qqq);


    }

    public static void sum(int number1, int number2) {
        int sumOfTwoNumbers = number1 + number2;
        System.out.println("sum= " + sumOfTwoNumbers);
    }

    public static int sum2(int num1, int num2) {
        int sumOfTwoNum = num1 + num2;
        return sumOfTwoNum;
    }

    public static boolean isEven(int number) {
        boolean b;
        b = number % 2 == 0;
        return b;
    }

    public static int arraySum (int[] array){
        int sum = 0;
        for (int v: array){
            sum=sum + v;
        }
        return sum;
    }
}


