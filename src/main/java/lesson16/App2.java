package lesson16;

import java.io.EOFException;

public class App2 {
    public static void main(String[] args) {
        int[]arr = {1,5,1,1,1};
        System.out.println("Before try/catch");
        try{
            System.out.println("Before exception");
//            arr[4] = 10;
//            throw new EOFException("Some probs");
//            int xx = 5/0;
//            System.out.println("Code after exception");

        } catch (ArrayIndexOutOfBoundsException error){
            System.out.println("Wrong index");
        } catch (ArithmeticException error){
            System.out.println("Check your Math");
        } catch (Exception error) {
            System.out.println("Caught!");
        } finally {
            System.out.println("This code will run in any case");
        }

        System.out.println("Code after try/catch block");

    }
}
