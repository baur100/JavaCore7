package lesson7;

public class homework1 {

    public static void main(String[] args) {
        int s = 1;
        int m = 2;

         sum(s,m);

         int k =10;
         int l =11;

         sum(k,l);

         int a=100;
         int b = 100;

         sum(a,b);

     //sum2

        int xx = sum2(6,6);
         System.out.println(xx);

           int x1= sum2(1,1);
           System.out.println(x1);

          int x2= sum2(5,5);

          System.out.println(xx);
            System.out.println(x1);
            System.out.println(x2);

     //isEven

        boolean number1 = isEven(5);

        boolean number2 = isEven(10);

        boolean number3 = isEven(15);
        boolean number4 = isEven(4);

         System.out.println("Is number1 even? - " + number1);
         System.out.println("Is number2 even? - " + number2);
         System.out.println("Is number3 even? - " + number3);
         System.out.println("Is number4  even? - " + number4);


    }
    //sum

     public static void sum(int a,int b) {
         int sum = 0;
         sum = a + b;
         System.out.println("Sum of two numbers  " + sum);
     }
         // sum2
         public static int sum2 ( int num1, int num2){
             int result = num1 + num2;
             return result;

         }
             //IsEven

             public static boolean isEven ( int x){
                 boolean b;
                 b = x % 2 == 0;
                 return b;

             }
         }







