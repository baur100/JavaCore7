package work;

public class homework {


    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 7, 8};
        int sum = 0;
        int i = 0;

        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println(sum);




        int[] y = {3,9,1,8,4,8,5};
        int minValue = arrayMin(y);
        System.out.print(minValue);





    }

    public static int arrayMin(int[] y) {
        int min= y[0];
        for (int v : y) {
            if (v < min) {
                min = v;
            }
        }
        return min;

    }



    }






