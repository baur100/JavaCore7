package homework7;



public class Hw72 {
    public static int sum2(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static void main(String[] args) {
        int s1 = sum2(11, 32);
        System.out.println("11 + 32 = " + s1);
        int s2 = sum2(10, 329);
        System.out.println("10 + 329 = " + s2);
        int s3 = sum2(1, 32);
        System.out.println("1 + 32 = " + s3);

    }
}
