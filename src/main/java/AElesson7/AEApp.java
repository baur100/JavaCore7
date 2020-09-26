package AElesson7;

public class AEApp {
    public static void main(String[] args) {
        hello();
        int xx = sumOfTwoNumbers(2,4);
        int xxx = sumOfTwoNumbers(55,45);

        System.out.println(xx);
        System.out.println(xxx);

    }

    public static int sumOfTwoNumbers (int num1, int num2){
        int result = num1+num2;
        return result;
    }

    public static void hello(){
        System.out.println("hello");
    }
}
