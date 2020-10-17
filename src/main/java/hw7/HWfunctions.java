package hw7;

public class HWfunctions {

//1. Create a new function `sum` - it takes in 2 params (int, int) and print out result of their sum
// (hint - this is void function - it not returns anything - just print on screen) - invoke it 3 times with different params


//2. Create a new function `sum2` - it takes in 2 params (int, int) and returns their sum.
// Invoke it 3 times with different params. Save a result in a variable. print out variable (hint - returning type - int)


//3. Create function `isEven` - int takes an int as an argument and return true if it is even or false if it is odd
// invoke it with 4 different params - print out results

    public static void sum( int a ,  int b){
        int add = a + b;
        System.out.println(" The total sum is : " + add);
    }

    public static int sum2(int a , int b){
        int addition = a + b ;
        return addition;
    }

    public static boolean isEven(int a){
          if( a % 2 == 0 ) {
              System.out.println(a);
              return true ;
          }
          else {
              System.out.println(a);
              return false;
          }
    }


    public static void main ( String[]args){
        //Part1.
        sum(123,321);
        sum(150,250);
        sum(750,2500);
        System.out.println("------------------------------");
        System.out.println("------------------------------");
    //-----------------------------------------//
        //Part2.
        int total = sum2(575,399);
        System.out.print(" The total sum is : "+ total );

        int total1 = sum2(677,1200);
        System.out.print("\n"+" The total sum is : " + total1);

        int total2 = sum2(1000,1);
        System.out.print("\n"+" The total sum is : " + total2);

        System.out.println("\n"+"------------------------------");
        System.out.println("------------------------------");
    //-----------------------------------------//
        //Part3.
        boolean result1 = isEven(88);
            System.out.println("Is this an even number ? ");
            System.out.println("This is " +result1 + "\n");

        boolean result2= isEven(101);
            System.out.println("Is this an even number ? ");
            System.out.println("This is "+result2 + "\n");

        boolean result3 = isEven(99);
            System.out.println("Is this an even number ? ");
            System.out.println("This is "+result3 + "\n");

        boolean result4  = isEven(100);
            System.out.println("Is this an even number ? ");
            System.out.println("This is "+result4 + "\n");

    }
}


