package me1stweekhomework;

public class Lesson4 {

    public static void main(String[] args) {
        int[] x = {2, 76, 9, 90, 31, 76, 6, 88, 21, 12};
//Part 1
        System.out.print("a) ");
        for (int v : x) {
            System.out.print(v + " ");
        }

        System.out.print('\n' + "b) ");
        for (int v : x) {
            if (v % 2 == 0) {
                System.out.print(v + " ");
            }
        }

        System.out.print('\n' + "c) ");
        for (int a : x) {
            if (a % 3 == 0) {
                System.out.print(a + " ");
            }
        }
        System.out.print('\n'+"d) ");
        int max = x[0];
        for (int b : x ){
            if (b > max){
                max = b;
            }
        }
        System.out.print("Max - "+max);

        System.out.print('\n'+"e) ");
        int min = x[0];
        for (int b : x){
            if (b < min){
                min = b;
            }
        }
        System.out.print("Min - "+min);

        System.out.print('\n'+"f) ");
        for (int b : x){
            if (b % 2 ==1){
                System.out.print(b +" ");
            }
        }

        // Part 2
        System.out.println('\n'+"Part 2");
        int index = 0;
        int [] ind = {10,15,12,7,88,10,6,17,23,10,10,16};
        for (int c : ind){
            if (c ==10){
                System.out.print (index +" ");
            }
            index ++;
        }
    }
}
