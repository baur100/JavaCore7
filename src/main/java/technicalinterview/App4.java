package technicalinterview;

public class App4 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 2, 3, 0};

        boolean xx = anyReapets(arr);
    }

    private static boolean anyReapets(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("found");
                    return true;
                }
            }
        }
        System.out.println(" not found");

        return false;
    }
}
