package AElesson8;

public class App {
    public static void main(String[] args) {

        String newWord = sumOfTwo("semi", "colon");
        System.out.println(newWord);
        String numbers = sumOfTwo("1", "5");
        System.out.println(numbers);

        int res = sumOfTwo(1,5);
        System.out.println(res);


        // var - assigns type to variable
        var xx = sumOfTwo(1.5, 5.2);
        System.out.println(xx);

        double yy = sumOfTwo(1.5, 5.2);
        System.out.println(yy);

        int zz = sumOfTwo1("1", "5");
        System.out.println(zz);

    }
    public static String sumOfTwo (String str1, String str2){
        String str = str1 + str2;
        return str;
    }
//   Function Overload - we can name two functions the same name if the have different parameters.
    // Function signature - name + passed parameters
    public static int sumOfTwo (int n1, int n2){
        int res = n1 + n2;
        return res;
    }

    public static double sumOfTwo (double a, double b){
        return a+b;
    }

    public static int sumOfTwo1 (String xx, String yy) {
        int num1 = Integer.parseInt(xx);
        int num2 = Integer.parseInt(yy);
        return num1 + num2;
    }

}
