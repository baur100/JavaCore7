package lesson7;

public class Work73 {
    public static boolean isEvenX(int number){
        return (number % 5) ==0;
    }
    public static void main (String[]args){
        System.out.println(isEvenX(9));
        System.out.println(isEvenX(13));
        System.out.println(isEvenX(15));
    }
}
