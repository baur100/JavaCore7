package homework6;
//  2. Create a new function `sum2` - it takes in 2 params (int, int) and returns their sum.
//Invoke it 3 times with different params. Save a result in a variable. print out variavle (hint - returning type - int)
public class hw6part2 {
    public static void main(String[] args) {

        int res = summ(2, 5);
        int res1 = summ(5, 5);
        int res2 = summ(-7777, 665);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
    }

    public static int summ(int num1, int num2) {
        int result = num1 + num2;
        return result;

    }
}





