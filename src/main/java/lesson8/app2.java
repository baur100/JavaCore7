package lesson8;

public class app2 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,1,3};

        int[] odNumbers = getOddFromArray(arr);
        for (int v : odNumbers){
            System.out.println(v);
        }

    }
    public static int[] getOddFromArray(int[] arr) {
        int count = 0;
        for (int v:arr){
            if(v%2==1){
                count++;
            }
        }
        int[] res = new int[count];
        int index = 0;
        for (int v:arr){
            if(v%2==1){
                res[index++]=v;
            }
        }
        return res;
    }
}
