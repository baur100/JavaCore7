package Lesson17;

import java.io.EOFException;

public class App2 {
    public static void main(String[] args) {
        int [] arr = {1,5,1,1,1};
        try {
            System.out.println("Before exeption");

            arr[49] = 10;
            throw  new EOFException("Some prob");
           /// int xx = 5/0;
           /// System.out.println("After axception");
        }catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Wrong");
        }catch (ArithmeticException error) {
            System.out.println("Check your math");
        }catch (Exception error){
            System.out.println("Caught");

        }

        System.out.println("Code after");
        }

    }

