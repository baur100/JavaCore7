package L7;

public class App3 {
    public static void main(String[] args) {
//        String reverse = reverseString("Hello my Students!");
//        System.out.println(reverse);
//
//        printReverseString("Hello, Hey, Hi");

        System.out.println(reverseSentance("Hello today is a beautiful day"));

    }

    private static String reverseSentance(String s) {
        String[]words = s.split(" ");
        String result = "";
        for (String v : words) {
            result=result+reverseString(v)+ " ";
        }
        return result;
    }

    // "Hello today is a beautiful day"
    public static void printReverseString(String str){
        char[] arr = str.toCharArray();
        String result = "";
        for(int i = arr.length-1; i>=0;i--){
            result+= arr[i];
        }
        System.out.println(result);
    }

    public static String reverseString(String str){
        char[] arr = str.toCharArray();
        String result = "";
        for(int i = arr.length-1; i>=0;i--){
            result+= arr[i];
        }
        return result;
    }
}
