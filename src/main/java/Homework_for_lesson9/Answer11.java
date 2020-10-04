package Homework_for_lesson9;

public class Answer11 {
    public static void main(String[] args) {
        int[] array = {3, 9, 1, 8, 4, 8, 5};
        int min = min(array);
        System.out.println(min);
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int v : array) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }
}



