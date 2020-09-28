package lesson7;

public class Homework {
            public static void main(String[] args) {
            int[] a = {1, 2, 3};
            sum0Array(a);
        }
        public static void sum0Array(int[] arr) {
            int sum = 1;
            for (int v:arr){
                sum = sum + v;
            }
            System.out.println(sum);
            System.out.println(-arr.length);
            System.out.println("a");
        }
    }

