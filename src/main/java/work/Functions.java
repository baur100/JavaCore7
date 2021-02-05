package work;

public class Functions {

    public static void main(String[] args) {
      double r1 =2.2;
      double area1 = circleArea(r1);
        System.out.println(area1);

     Hi();

     int [] ar1 = {1,2,3};
        int [] ar2 = {1,2,3,6};

     int max = getMax(ar2);
        System.out.println(getMax(ar2));

     Hallo();
     Name("Alex");
     Name("Timur");


    }
        private static void Hi () {
            System.out.println("How are you");
        }

        private static void Hallo () {
            System.out.println("Hi you");
        }
        private static void Name (String Name){
            System.out.println("Hallo" + Name);
        }
        public static double circleArea ( double radius ){
            double area = Math.PI * radius * radius;
            return area;
        }
    private static int getMax(int[] a) {

        int max1 = a[0];
        for (int v : a) {
            if (v > max1) {
                max1 = v;
            }
        }
            return max1;
        }
    }



