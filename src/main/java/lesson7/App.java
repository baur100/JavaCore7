package lesson7;

public class App {
    public static void main(String[] args) {
        int res = summOfTwoNumbers(2,4);
        int res2 = summOfTwoNumbers(56,56);

        System.out.println(res);
        System.out.println(res2);
    }

    public static void hello(){
        System.out.println("hello");
    }

    public static int summOfTwoNumbers(int num1, int num2){
        int result = num1+num2;
        return result;
    }
}




