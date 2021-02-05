public class FunctionPractice {

    public static void main(String[] args) {
      ///  hello (12365);

      //  trip("Boise", "Sacramento");

     //   int xx = sum (1,2,3);
      //  System.out.println(xx);

        //System.out.println(sc(5));

        int [] numbers = {1,2,3,4};
        for (int v: numbers)   {
            if(isOdd(v))  {
                System.out.println(v);
           }
     }

   // }
    
     //   public static void hello (int name) {
          //  System.out.println("Hello" + " " + name);

      //  }

      //  public static void trip(String  departure , String arrival )    {
       //     System.out.println("you plane left" + " " + departure + " " + "" + " " + "your plane will arrive to" +
                 //   " " + arrival);
     //   }

     // public static int sum (int a, int b, int c)  {
        //    //    int result = a+b+c;
        //      //  return result;
    // / }

     /// public static double sc(double radius) {
      //    double sq1 = 3.14 * radius * radius;
      //    return sq1;

      }
      public static boolean isOdd (int number){
        if (number%2==1)   {
            return true;}
        else
            return false;
       }


}

