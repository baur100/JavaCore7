package aeTechnicalInterview;

import java.util.Arrays;

public class App3 {
    public static void main(String[] args) {
        // Two words to prove if they anagrams or not - return true or false

        String str1 = "below";
        String str2 = "elbow";

        boolean isAnagram = isItAnagram(str1, str2);
        System.out.println(isAnagram);


    }

    private static boolean isItAnagram(String str1, String str2) {
        if(str1.length()!=str2.length()) return false;
        char[] strArr1 = str1.toCharArray();
        char[] strArr2 = str2.toCharArray();

        Arrays.sort(strArr1);
        Arrays.sort(strArr2);

        for(int i = 0; i<strArr1.length; i++){
            if (strArr1[i]!=strArr2[i]){
                return false;
            }
        }
        return true;
    }
}
