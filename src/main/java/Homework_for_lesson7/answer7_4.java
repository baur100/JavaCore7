package Homework_for_lesson7;

public class answer7_4 {
    public static void main(String[] args){

        int a = 22;
        ifEven(a);
        System.out.println(ifEven(a));

        int b = 13;
        ifEven(b);
        System.out.println(ifEven(b));

        int c = 56;
        ifEven(c);
        System.out.println(ifEven(c));

        int d = 28;
        ifEven(d);
        System.out.println(ifEven(d));
    }
    public static boolean ifEven(int a){
        if(a % 2 == 0)
            return true;
        else
            return false;
    }
}
