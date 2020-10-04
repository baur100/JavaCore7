package Homework_for_lesson9;

public class Answer10 {
    public static void main(String[] args) {
        int[] x= {2,3,4,5,6,7,8};
        int sum = sum(x);
        System.out.println(sum);
    }

    public static int sum(int[] x)
    {
        int sum=0;
        for(int v:x)
        {
            sum=sum+v;

        }
        return(sum);
    }
}
