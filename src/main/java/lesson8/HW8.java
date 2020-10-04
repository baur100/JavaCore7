package lesson8;

//1. Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
//invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result
 public class HW8{
     public static int sumArray(int [] numbers){ //Whatever you define the function to be.
                                               // make the parameters ALWAYS match that.
                                               // ex: public static int sum ( here should an int ) .
                                               // ex2 : public static String sum ( here should an String).
                                               // ex3: public static int [] sum ( here should an int []).
                                               // ex4: int i=0 tells you where you want to start from

            int addition = 0;

         //for (int i=0; i<=numbers.length-1 ; i++)
         for (int i=numbers.length-1; i>=0 ; i--)
         {
                  addition  = addition + numbers[i]; //here we can use either addition = addition + or addition += numbers[i]

         }
         return addition ;
     }

    //2. Create function sort - which takes  int[] as a param and print out sorted array invoke it from main()
    // pass {3,9,1,8,4,8,5} as a param (this will be void func)

    public static void sort(int [] numbers){

        for (int i=numbers.length-1; i>=0 ; i--)
        {

             if (numbers[i] > numbers[i+1]){

             }




        }

    }


     public static void main ( String [] args) {

         int [] numbers = {2,3,5,6,7,8};

         System.out.println(sumArray(numbers));
     }





}
