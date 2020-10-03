package homework7;

public class App {
    public static void main(String[] args) {
        System.out.println(isOdd(11));
    }


    public static boolean isEven(int number){
        boolean result = number%2==0;
        return result;
    }
    public static boolean isOdd(int number) {
        boolean result = number % 2 ==1;
        return result;
    }
}
