package lesson8;

public class App {
    public static void main(String[] args) {
        String newWord = sumOfTwo("semi","colon");
        System.out.println(newWord);
        String numbers = sumOfTwo("1","5");
        System.out.println(numbers);

        int res = sumOfTwo(1,5);
        System.out.println(res);

        double xx = sumOfTwo(1.5,5.2);

        int newNum = sumOfTwo1("1","5");
        System.out.println(newNum);
    }

    public static int sumOfTwo1(String xx, String yy){
        int num1 =  Integer.parseInt(xx);
        int num2 =  Integer.parseInt(yy);
        return num1+num2;
    }

    public static double sumOfTwo(double a,double b){
        return a+b;
    }

    public static String sumOfTwo(String str1, String str2){
        String str = str1+str2;
        return str;
    }

    public static int sumOfTwo(int n1, int n2){
        int res = n1+n2;
        return res;
    }
}
