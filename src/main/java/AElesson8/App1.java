package AElesson8;

public class App1 {
    public static void main(String[] args) {
        //create an array with odd numbers only

        int[] arr = {1, 2, 5, 4, 1, 3};


        int[] oddNumbers = getOddFromArray(arr);
        for (int v : oddNumbers) {
            System.out.println(v);
        }

    }

    public static int[] getOddFromArray(int[] arr) {
        // count number of odd numbers to know array size
        int count = 0;
        for (int v : arr) {
            if (v % 2 == 1) {
                count++;
            }
        }
        //create empty array with correct size
        int[] res = new int[count];

        // fill in array with numbers
        int index = 0;
        for (int v : arr) {
            if (v % 2 == 1) {
                res[index] = v;
                index++;
                //or res[index++]=v;
            }
        }
        return res;
    }

}


