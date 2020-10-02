package Homework_for_lesson9;

public class answer9 {
    public static void main(String[]args)
    {
        int[] array ={3,9,1,8,4,8,5};
        min(array);
    }

    public static void min (int[] arr)
    {
        int min = arr[0];
        for(int v:arr){
            if (v < min){
                min = v;
            }
        }
        System.out.println(min);
    }
}
