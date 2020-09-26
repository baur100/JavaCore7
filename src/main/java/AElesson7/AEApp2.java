package AElesson7;

public class AEApp2 {
    public static void main(String[] args) {
        double rad = 5.3;
        double len = lengthOfCircle(rad);
        System.out.println(len);

    }
    public static double lengthOfCircle (double radius){
        double length = 2*radius*Math.PI;
        return length;
    }
}
