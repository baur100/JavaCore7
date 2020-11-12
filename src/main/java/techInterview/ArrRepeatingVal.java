package techInterview;

import java.lang.reflect.Array;

public class ArrRepeatingVal {
    public static void main(String[] args) {
        int[] arr = {1,4,6,4};

        boolean r = anyRepeatingVal(arr);
        System.out.println(r);
    }

    private static boolean anyRepeatingVal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] == temp) {
                    return true;
                }
            }
        }
        return false;
    }
}
