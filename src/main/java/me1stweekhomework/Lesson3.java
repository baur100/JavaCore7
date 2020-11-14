package me1stweekhomework;

public class Lesson3 {

    public static void main(String[] args) {

        System.out.println("Part 1");
        int[] a = new int[10];
        a[0] = 2;
        a[1] = 76;
        a[2] = 9;
        a[3] = 90;
        a[4] = 31;
        a[5] = 76;
        a[6] = 2;
        a[7] = 76;
        a[8] = 21;
        a[9] = 12;

        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println("- "+a.length+" indexes");

        System.out.println(a[a.length-1] +" - last number");

        System.out.println("Part 2");
        int[] b = {2, 76, 9, 90, 31, 76, 2, 76, 21, 12};
        System.out.println(b[0]+" "+b[1]+" "+b[2]+" "+b[3]+" "+b[4]+" "+b[5]+" "+b[6]+" "+b[7]+" "+b[8]+" "+b[9]+" - "+b.length+" indexes");

        System.out.println("Part 3");
        boolean[] c = new boolean[5];
        c[0]= true;
        c[1]= false;
        c[2]= 5>6;
        c[3]= 7==8;
        c[4]= 3>2;

        for (boolean element : c) {
            System.out.print(element + " ");
        }
        System.out.println("- "+c.length+" indexes");

        System.out.println("Extra");
        int[] d = {a[2],b[4]};
        System.out.println(d[0]+" "+d[1]+" - "+d.length+" indexes");



    }
}
