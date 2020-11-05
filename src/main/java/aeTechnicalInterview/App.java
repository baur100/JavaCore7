package aeTechnicalInterview;

public class App {
    public static void main(String[] args) {


        //whiteboard shared with the interviewer.
        //All should be written by hand, no shortcuts
        //Code in Pair - can offer what language you prefer to interview be held
        //Usually questions about strings and arrays

        //Strings functions - split and join

        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod";
        String reversed = reversedString(str);
        System.out.println(reversed);

    }

    private static String reversedString(String str) {
        String[] words = str.split(" ");
        String[] reversedArr = new String[words.length];
        for(int i=0; i< words.length; i++){
            reversedArr[words.length-1-i] = words[i];
        }
        return String.join(" ", reversedArr);
    }
}
