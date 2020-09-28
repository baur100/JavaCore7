package homework6;

//1. Create a new function `sum` - it takes in 2 params (int, int) and print out result of their sum
// (hint - this is void function - it not returns anything - just print on screen) - invoke it 3 times with different params
public class hw6 {
    public static void main(String[] args) {

        summ(2, 5);
        summ(5, 5);
        summ(-7777, 665);

    }

    public static void summ(int num1, int num2) {
        int result = num1 + num2;
        {
            System.out.println(result);
        }
    }
}









