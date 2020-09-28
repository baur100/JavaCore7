package Homework_for_lesson7;

public class answer7_3 {
    public static void main(String[] args)
    {
        int a = 15;
        ifEven(a);


        int b = 4;
        ifEven(b);

        int c = 11;
        ifEven(c);

        int d = 68;
        ifEven(d);
    }
    public static void ifEven(int x){
        if(x % 2==0)
        {
            System.out.println("true");
        }
        else{
        System.out.println("false");
    }

    }
}
