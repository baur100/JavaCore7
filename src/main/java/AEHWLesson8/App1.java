package AEHWLesson8;

public class App1 {
    public static void main(String[] args) {
        // find and print out prime numbers out of the provided limit
        int limit = 10;
        arrayOfPrime(limit);

    }
    public static boolean isPrime (int x){
        for (int i=2; i<x; i++){
           if (x%i==0){
               return false;

           }
        }
        return true;
    }

    public static void arrayOfPrime(int limit){
        for (int i=2; i<=limit; i++){
            if (isPrime(i) == true){
                System.out.println(i);
            }
        }
    }


}
