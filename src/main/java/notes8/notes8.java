package notes8;

public class notes8 {
    public static void main(String[] args) {
        String newWord = somOfTwo("semi", "colon");
        System.out.println(newWord);

        String newWordNumber = somOfTwo("1", "5");
        System.out.println(newWordNumber);

        int res = sumOfTwo(1,5);
        System.out.println(res);


    }

    //argument sent inside funtion is a signature
    public static String somOfTwo(String str1, String str2){
        String str = str1+str2;
        return str;
    }
//can use the same function name with different type one here is int the other is string
    public static int sumOfTwo(int n1, int n2){
        int res = n1+n2;
        return res;}
}


