public class PracticeFunctions3 {

    public static void main(String[] args) {

        System.out.println(plus(1, 2));

        int [] arr = {1,5};
          int sumOfArray = plus1(arr);
        System.out.println(sumOfArray);

    }

    private static int plus(int a, int b) {
        return a - b;


    }
    private static int plus1(int [] arr) {
        int sum = 0;
        for (int v: arr) {
            sum += v;
        }
        return sum;
            


        }
    }
