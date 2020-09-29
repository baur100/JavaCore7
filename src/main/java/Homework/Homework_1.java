package Homework;

public class Homework_1 {
    public static void main(String[] args) {

        sum(5, 7, 9);
        sum(4, 6, 8);
        sum(0, 11, 15);
    }

    public static void sum(int a, int b, int c) {
        int d = a+b+c;
        System.out.println(d);
        System.out.println(a++);
        System.out.println(b+c);

    }
}
