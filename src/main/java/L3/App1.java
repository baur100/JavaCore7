package L3;

public class App1 {
    public static void main(String[] args) {
        //    for (int i = 0; i < 6; i = i + 1) {
        //        System.out.println(i);
        //    }
        //    for (int i = 0; i > 10; i++) {
        //       System.out.println(i);
        //   }
        //    int xx = 8;
        //   for (int i = 0; i < xx; i++) {
        //        System.out.println(i * 3 - 2);
        //    }
        //    int bb=9;
        //    int cc=2;
        //    for (String xx="hello"; bb>cc; ){
        //       cc++;
        //        System.out.println(xx);
        //    }
        //    for (int i=10; i>=0; i=i-2){
        //         System.out.println(i);
        //     }
        //    int vv = 5;
        //    int mm = 10;
        //    while (mm > vv) {

        //       System.out.println(++vv);
        //    }
        //    do {
        //    } while (vv < mm);

        //     int[] arr = {2,1,1,2,5,8,0,-6,3};
        //     for (int index = 0; index<arr.length; index++){
        //         System.out.println(arr[index]);
        //    }
        //    String[] colors = {"Red", "Pink", "Green", "Violet", "Cyan", "Orange", "Magenta", "Yellow"};
        //    for (int i = 0; i < colors.length; i++) {
        //        System.out.println(colors[i]);
        //    }
        //  String[] food = {"Friers", "Burger", "Tomato", "Shrimps", "Cheeseburger"};
        //    for(int i =4; i>=0 ; i--){
        //        System.out.println(food[i]);
        //    }
        //    for(int i=0; i < food.length; i++){
        //        System.out.println(food[i]);
        //    }
        //    for (String v : food) {
        //        System.out.println(v);
        //    }
//        double[] temps = {6.4,3.33,7,78,2.45};
//        for(double v : temps) {
//            System.out.println(v);
//        }
        // 4%2 = 0     2*2+0
        // 5%2 = 1     2*2+1
        // 10 % 3 = 1  3*3+1
        // 11 % 3 = 2  3*3+2
        // 11 % 2 = 1  5*2+1
        int[] numbers = {3, 3, 45, 2, -9, 0, 0, 87, 4, 3, 23};
        for (int v : numbers) {
            if (v % 2 == 0) {
                System.out.println(v);
            }
        }
        //  int max = numbers[0];
        //  for (int v : numbers) {
        //      if (v > max) {
        //         max = v;
        //      }
        //  }
        //  System.out.println("Max = " + max);
        //  int min = numbers[0];
        // for (int v : numbers) {
        //     if (v < min) {
        //         min = v;
        //     }
        // }
        //  System.out.println("Min = " + min);

    }

}
