package homework7;
 /*1. Create a new function `sum` - it takes in 2 params (int, int) and print out result of their sum
  (hint - this is void function - it not returns anything - just print on screen) - invoke it 3 times with different params
2. Create a new function `sum2` - it takes in 2 params (int, int) and returns their sum.
Invoke it 3 times with different params. Save a result in a variable. print out variable (hint - returning type - int)
3. Create function `isEven` - int takes an int as an argument and return true if it is even or false if it is odd
invoke it with 4 different params - print out results*/

import com.sun.org.apache.xpath.internal.objects.XBoolean;

//---------------------------------------------Question 1
public class HW7 {
    public static void sum(int a, int b)
    {
        System.out.println(a+b);
    }
//---------------------------------------------Question 2
// for any function when we use "void" then we need to use sys out in the function itself
// (bcz void doesnt return anything)
// for any function without "void" then we declare the sysout in the main method for that function.

    public static int sum2(int a, int b) {
        //sum(56, 87);
        // return a+b;
        int addition = a + b;
        return (addition);
    }
//---------------------------------------------Question 3

        public static boolean isEven(int number){
            if( number % 2 == 0 )
            {
                return true;
            }
            else
            {
                return false;
            }
    }






    public static void main(String[]args){
    System.out.println("Question 1----------------------------------------------------------------");
    sum(2,5);
    sum(6,8);
    sum(11, 17);

    System.out.println("Question 2----------------------------------------------------------------");
    System.out.println(sum2(10,54));
    System.out.println(sum2(23,55));
    System.out.println(sum2(29,89));

    System.out.println("Question 3----------------------------------------------------------------");

        boolean answer0=isEven(10);
        boolean answer1=isEven(20);
        boolean answer2=isEven(30);
        boolean answer3=isEven(40);
        boolean answer4=isEven(45);
        if (answer0==true)
        {
            System.out.println(10+" is EVEN number");
        }
        else
        {
            System.out.println(10 + " is ODD");
        }

        if (answer1==true)
        {
            System.out.println(20+" is EVEN number");
        }
        else
        {
            System.out.println(20 + " is ODD");
        }
        if (answer2==true)
        {
            System.out.println(30+" is EVEN number");
        }
        else
        {
            System.out.println(30 + " is ODD");
        }
        if (answer3==true)
        {
            System.out.println(40+" is EVEN number");
        }
        else
        {
            System.out.println(40 + " is ODD");
        }
        if (answer4==true)
        {
            System.out.println(45+" is EVEN number");
        }
        else
        {
            System.out.println(45 + " is ODD");
        }


    }

}
