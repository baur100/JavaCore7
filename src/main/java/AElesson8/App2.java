package AElesson8;

public class App2 {
    public static void main(String[] args) {
      int limit = 53;
        printPrimeNumbers(limit);

    }
    // find prime numbers (1 is not a prime number, the smallest prime number is 2)
    public static void printPrimeNumbers(int limit) {
         for (int i=2; i<=limit; i++){
             if (isPrime(i)){
                 System.out.println(i);
             }
         }
    }

    public static boolean isPrime(int number) {
        for (int i=2; i<number; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }


}
