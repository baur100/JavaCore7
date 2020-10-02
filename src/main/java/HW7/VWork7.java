package HW7;

public class VWork7 {
    public static void main(String[] args) {

        sum(4, 6);
        sum(40, 60);
        sum(400, 600);



        int x = sum2(8, 12);
        int y = sum2(80, 120);
        int z = sum2(800, 1200);
        System.out.println("sum2= " + x);
        System.out.println("sum2= " + y);
        System.out.println("sum2= " + z);



        boolean xx = isEven(1);
        boolean yy = isEven(22);

        int zz = sum2(50,51);
        boolean zzz = isEven(zz);


        int[] q = {1,2,3,4};
        int qq = arraySum(q);
        boolean qqq = isEven(qq);

        System.out.println("Is xx even? - " + xx);
        System.out.println("Is yy even? - " + yy);
        System.out.println("Is zz even? - " + zzz);
        System.out.println("Is qq even? - " + qqq);


    }

    public static void sum(int number1, int number2) {
        int sumOfTwoNumbers = number1 + number2;
        System.out.println("sum= " + sumOfTwoNumbers);
    }

    public static int sum2(int num1, int num2) {
        int sumOfTwoNum = num1 + num2;
        return sumOfTwoNum;
    }

    public static boolean isEven(int number) {
        boolean b;
        b = number % 2 == 0;
        return b;
    }

    public static int arraySum (int[] array){
        int sum = 0;
        for (int v: array){
            sum=sum + v;
        }
        return sum;
    }
}
