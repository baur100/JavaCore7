package me1stweekhomework;

public class Lesson2 {

    public static void main(String[] args) {

        int a=100;
        int x=12;
        int d=12;
        int c=122;
        //Find zz

        boolean zz1 = a==d; // false
        boolean zz2 = x==d;
        boolean zz3 = c>=a;
        boolean zz4 = x>=d;
        boolean zz5 = (d==c) || (x==d);
        boolean zz6 = (c>x) && (d>=x);
        boolean zz7 = (a>x) || (a>c);
        boolean zz8 = (a==c) && (d==c);
        boolean zz9 = (c==c) && (a>=a);
        boolean zz0 = (c>c) || (a<=a);
        boolean zz10 = (x>a) && (c==d);
        boolean zz11 = (c>a) && (x>d);

        System.out.println(a+ "=" +d+ " -" +zz1);
        System.out.println(x+ "=" +d+ " -" +zz2);
        System.out.println(c+ ">=" +a+ " -" +zz3);
        System.out.println(x+ ">=" +d+ " -" +zz4);
        System.out.println(d+ "=" +c+ " or " +x+ "=" +d+ " -" +zz5);
        System.out.println(c+ ">" +x+ " and " +d+">="+x+ " -" +zz6);
        System.out.println(a+ ">" +x+ " or " +a+ ">" +c+ " -" +zz7);
        System.out.println(a+ "=" +c+ " and " +d+ "=" +c+ " -" +zz8);
        System.out.println(c+ "=" +c+ " and " +a+ ">=" +a+ " -" +zz9);
        System.out.println(c+ ">" +c+ " or " +a+ "<=" +a+ " -" +zz0);
        System.out.println(x+ ">" +a+ " and " +c+ "=" +d+" -" +zz10);
        System.out.println(c+ ">" +a+ " and " +x+ ">" +d+ " -" +zz11);

    }
}
