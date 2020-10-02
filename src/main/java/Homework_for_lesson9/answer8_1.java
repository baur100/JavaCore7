package Homework_for_lesson9;

public class answer8_1 {
    public static void main(String[] args)
    {

        int[] x = {2, 3, 4, 5, 6, 7, 8};
        sumOfArray(x);
    }
    public static void sumOfArray(int[] arr)
    {
        int total =0;
        for(int v:arr)
        {
            total=total+v;
    }
        System.out.println(total);
}
}


