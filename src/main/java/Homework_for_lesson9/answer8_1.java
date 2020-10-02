package Homework_for_lesson9;

public class answer8_1 {
    public static void main(String[] args)
    {

        int[] x = {2, 3, 4, 5, 6, 7, 8};
        sum(x);
    }

    public static void sum(int[] arr)
    {
        int total =0;
        for(int v:arr)
        {
            total=total+v;
        }
        System.out.println(total);
    }
}


