package technicalinterview;

public class App {
    public static void main(String[] args) {
        System.out.println();
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod";
        String reversed = reverseString(str);
        System.out.println(reversed);
    }

    private static String reverseString(String str) {
        String[] words = str.split(" ");
        String[] reversedArr = new String[words.length];
        for (int i=0; i< words.length;i++){
            reversedArr[words.length-1-i] = words[i];
        }
        return String.join(" ",reversedArr);
    }

}
