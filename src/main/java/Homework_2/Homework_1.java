package Homework_2;

    //Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
    // invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result

public class Homework_1 {
    public static void main(String[] args) {
        sum(2, 3, 5);
        sum(6,7,8);

    }
    public static void sum(int a, int b, int c){
        int d = a+b+c;
        int e = a*b*c;
        System.out.println(d + "\n==================");
        System.out.println(e);
    }
}
