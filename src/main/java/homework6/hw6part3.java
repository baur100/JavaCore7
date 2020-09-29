package homework6;
// 3. Create function `isEven` - int takes an int as an argument and return true if it is even or false if it is odd
//invoke it with 4 different params - print out results
public class hw6part3 {
    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(isEven2(3));
        System.out.println(isEven(28));
        System.out.println(isEven2(99));

    }
    public static boolean isEven(int num1) {
       boolean result =  num1%2 == 0;
        return result;}
        public static boolean isEven2(int num1) {
            boolean result = num1%2 == 1;
            return result;

        }}