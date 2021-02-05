public class FunctionPractice2 {

    public static void main(String[] args) {
      //  System.out.println(sum3(1,4));
      //  System.out.println(tickets(1000,66));

       //   sum(1,2);
        //
       ////   String x= sisters("Zarina","Aliko");
     //   System.out.println(x);

        int [] arr1 = {1,4,5,10};
        System.out.println(max(arr1));
    
    }

  //  public static void sum (int x, int c){
      //  System.out.println(x + c);

   // }

  //  public static String sisters(String a, String v) {
     //   return   a+v;
   // }
    //   public static int sum3(int w, int t)   {
     //   return w+t;
    //   }
   // public static double tickets (int fare, int age) {
     //   if (age <3) {
            ///return 0;
      //  }
     //   if (age <13) {
     //       return fare *0.5;
     //   }
     ///   if (age <66)  {
          //  return fare;
      //  }
     //   return fare *0.8;
     //   }

        public static int max(int []xx)    {
        int max = xx[0];
        for (int v: xx){
            if (v>max) {
                max=v;

            }
        }
        return max;
        }
    }

