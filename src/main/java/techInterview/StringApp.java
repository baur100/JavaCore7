package techInterview;

public class StringApp {
    //write a method to revert words in string sentence
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet";
//        String reverted = revertString(str);
        String reverted = revertStringJoin(str);
        System.out.println(reverted);
    }
    //first method with string.split
    public static String revertString(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (int i = words.length-1; i >= 0; i--){
            result += words[i]+" ";
        }
        return result.trim();
    }
    //second method with array.join
    public static String revertStringJoin(String str) {
        String[] words = str.split(" ");
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = words[words.length-1-i];
        }
        return String.join(" ", result);
    }
}
