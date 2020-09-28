package homework7;

public class Hw73 {
    public static boolean isEven(int number) {
       if((number % 2) == 0) {
           return true;

       } else {
           return false;
       }
    }
    public static boolean isEvenX(int number) {
        return (number % 2) == 0;
    }

    public static void main(String[] arguments) {
        System.out.println(isEven(8));
        System.out.println(isEvenX(3));
        System.out.println(isEvenX(11));
        System.out.println(isEvenX(12));
    }
}

