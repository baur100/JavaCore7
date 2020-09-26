package AElesson7;

public class AEApp3 {
    public static void main(String[] args) {
//        String reverse = reverseString("Hello my students!");
//        System.out.println(reverse);
//        System.out.println(reverseString("Hello, Hy, Hi"));
//
//        printReverseString("Hello, Hy, Hi");

        System.out.println(reverseSentence("Hello today is a beautiful day"));
    }
    public static String reverseString (String str){
        char[] arr = str.toCharArray();
        String result = "";
        for (int i = arr.length-1; i>=0; i--){
            result = result+arr[i];
            // or result+ = arr[i];
        }
        return result;
    }


    public static void printReverseString (String str) {
        char[] arr = str.toCharArray();
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result = result + arr[i];
            // or result+ = arr[i];
        }
        System.out.println(result);
    }

    //"Hello today is a beautiful day"

    public static String reverseSentence (String s){
        String[] words = s.split(" ");
        String result = " ";
        for(String v: words){
            result= result+reverseString(v) + " ";
        }
        return result;
    }

}
