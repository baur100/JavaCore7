package lesson7;

public class App {
    public static void main(String[] args) {
        int res = sumOfTwoNumbers(2,4);
        int res2 = sumOfTwoNumbers(56,56);  //every single method has to invoke in main method
        hello();
        name("rahil");

//      System.out.println(res);
        System.out.println(res2);
        System.out.println();
    }

    public static void hello(){
        System.out.println("hello");
    } // we only use sysout print when  we use void
        public static String name (String typename){
        return typename;
        }
    public static int sumOfTwoNumbers(int num1, int num2){
        int result = num1+num2;
        return result;
    }
}
