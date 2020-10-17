package lesson7;

public class App {
    public static void main(String[] args) {
        int res = sumOfTwoNumbers(2,4);
        int res2 = sumOfTwoNumbers(56,56);

        name("Hello my name is Emad");
        System.out.println();

        hello();
        System.out.println(res);
        System.out.println(res2);
    }

    public static void hello(){
        System.out.println("hello");

    }

    public static int sumOfTwoNumbers(int num1, int num2){
            int result = num1+num2;
            return result;
    }

    public static String name(String zebra){
        return zebra;
    }


}
