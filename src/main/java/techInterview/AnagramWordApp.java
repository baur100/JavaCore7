package techInterview;

public class AnagramWordApp {
    public static void main(String[] args) {
        String str1 = "below";
        String str2 = "elbow";

        boolean isAnagram = isItAnagram(str1, str2);
        System.out.println(isAnagram);
    }
    private static boolean isItAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (String v : str1.split("")) {
            if (!str2.contains(v)) {
                 return false;
            }
        }
        return true;
    }

}
