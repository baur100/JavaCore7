package lesson6;

public class Stanislav6 {
    public static void main(String[] args) {
//        1. First assignment
        sum(5,2);
        sum(9,11);
        sum(20,1);

//        2. Second assignment
        int res1 = sumByReturn(3,3);
        int res2 = sumByReturn(4,5);
        int res3 = sumByReturn(1,0);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

//        3. Third assignment
        boolean aa = isEven(10);
        boolean bb = isEven(11);
        boolean cc = isEven(13);
        boolean dd = isEven(14);

        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(dd);
    }
//      1. Create a new function `sum` - it takes in 2 params (int, int) and print out result of their sum
//      (hint - this is void function - it not returns anything - just print on screen) - invoke it 3 times
//      with different params

    public static void sum(int xx, int yy) {
        int result = xx + yy;
        System.out.println(result);
    }
//      2. Create a new function `sum2` - it takes in 2 params (int, int) and returns their sum.
//      Invoke it 3 times with different params. Save a result in a variable. print out variable
//      (hint - returning type - int)

    public static int sumByReturn(int num1, int num2) {
        return num1 + num2;
    }
//      3. Create function `isEven` - int takes an int as an argument and return true if it is even
//      or false if it is odd invoke it with 4 different params - print out results

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
