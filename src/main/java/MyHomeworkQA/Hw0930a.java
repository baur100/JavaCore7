package MyHomeworkQA;

public class Hw0930a {

    /*1. Create function `sum` - which takes int[] as a param and
    returns sum of all elements of the array. invoke it from main() -
    pass {2,3,5,6,7,8} as a param and print out result*/
    public static int sum(int[] nums){
        int result = 0;
        for (int x : nums){
            result += x;
        }
        return result;
    }

    /* 2. Create function sort - which takes  int[] as a param and
    print out sorted array invoke it from main() - pass {3,9,1,8,4,8,5}
    as a param (this will be void func)*/
    public static void sort(int[] jumbled){
        int temp = 0;
        for (int i = 0; i < jumbled.length; i++){
            for (int j = i+1; j < jumbled.length; j++){
                if (jumbled[i] > jumbled[j]){
                    temp = jumbled[i];
                    jumbled[i] = jumbled[j];
                    jumbled[j] = temp;
                }
            }
        }
        System.out.println("The sorted array: ");
        for (int y : jumbled){
            System.out.print(y + ", ");
        }
    }

    public static void main(String[] args) {
        int[] sumThis = {2, 3, 5, 6, 7, 8};
        int answer = sum(sumThis);
        System.out.println(answer);
        System.out.println("=========");
        int[] sortMe = {3, 9, 1, 8, 4, 8, 5};
        sort(sortMe);
        System.out.println("=========");

    }
}
