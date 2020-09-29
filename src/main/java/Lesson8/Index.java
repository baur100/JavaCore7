package Lesson8;

public class Index {
    public static void main(String[] args) {
        int limit = 11;
        printPrimeNumbers(limit);
    }

    public static void printPrimeNumbers(int limit) {
        for (int i=2; i <= limit; i++){
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number%i == 0) {
                return false;
            }
        }
        return true;
    }
}
