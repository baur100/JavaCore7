package homeworkTechnicalInterview;

public class App1 {
    public static void main(String[] args) {
    int[] arr = {1,4,5,7,7,2,3,0};

    boolean xx = anyRepeats(arr);
    System.out.println(xx);
}

    private static boolean anyRepeats(int[] arr) {
        for (int i = 0; i< arr.length; i++){
            int elementToCompare = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (elementToCompare == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

