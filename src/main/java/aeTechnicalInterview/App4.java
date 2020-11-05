package aeTechnicalInterview;

public class App4 {
    public static void main(String[] args) {
        // More array questions - prove that the array has repeating numbers and print out the duplicate

        int[] arr = {1, 4, 5, 5, 7, 7, 2, 3, 0};

        anyRepeats(arr);

    }

    private static void anyRepeats(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println((arr[i]));
                }
            }
        }
    }
}
