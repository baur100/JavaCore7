package Homework_for_lesson9;

import java.util.Arrays;

public class Answer12 {
    public static void main(String[] args) {
        int[] array = {3, 9, 1, 8, 4, 8, 5};
        sort(array);
    }
    public static void sort(int[] array) {
        Arrays.sort(array);
        for (int v:array){
            System.out.println(v);
        }
    }
}
