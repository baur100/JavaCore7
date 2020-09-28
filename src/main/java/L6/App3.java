package L6;

public class App3 {
    public static void main(String[] args) {
        String reverse = reversString("Hello Students !");
        System.out.println(reverse);

    }

    public static String reversString(String str) {
        char[] arr = str.toCharArray();
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result = result + arr[i];
        }
        return result;
    }
}