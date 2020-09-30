package homework7;

public class hw7 {
    public static void main(String[] args){
       sum(10,2);
       sum(5,3);
       sum(2,9);



        int bb = sum2(4,5);
        int cc = sum2(6,3);
        int dd = sum2(8, 2);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(dd);


        int ee = 102;
        int ff = 5;
        int gg = 20;
        int hh = 27;
        System.out.println(isEven(ee));
        System.out.println(isEven(ff));
        System.out.println(isEven(gg));
        System.out.println(isEven(hh));

    }
    public static void sum(int num1, int num2) {
        int result1 = num1+num2;
        System.out.println(result1);
    }

    public static int sum2(int num3, int num4) {
        int result2 = num3+num4;
        return result2;
    }
    public static boolean isEven(int number) {
        boolean result = number %2==0;
        return result;
    }
//    public static boolean isOdd(int number){
//        boolean result = number % 2==1;
//        return result;
//    }
}
