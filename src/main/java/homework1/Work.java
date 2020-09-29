package homework1;

public class Work {

    public static void main(String[] args) {
        //1
        sum(2, 3);
        sum(5, 7);
        sum(1, 8);

        //2
        int res = sum2(2, 11);
        sum2(6, 8);
        sum2(1, 9);

        System.out.println("#2 answer is "+res);

        //3
        int number = 3;
        System.out.println("#3 is this an even number? "+ isEven(number));

    }

    //        1. Create a new function `sum` - it takes in 2 params (int, int) and print out result of their sum (hint - this is void function
    //        - it not returns anything - just print on screen)
    //        - invoke it 3 times with different params
    public static void sum(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println(sum);
    }

    //        2. Create a new function `sum2` - it takes in 2 params (int, int) and returns their sum.
//        Invoke it 3 times with different params.
//        Save a result in a variable.
//        print out variable (hint - returning type - int)
    public static int sum2(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }


//        3. Create function `isEven` - int takes an int as an argument and return
//        true if it is even
//        or false if it is odd
//        invoke it with 4 different params - print out results
    public static String isEven(int arr){
            String res = "";
            if (arr%2 == 0){
                res = "true";
            }
            if (arr%2 == 1)
            {
                res = "false";
            }
            return res;


    }



}
