package aeTechnicalInterview;

public class App2 {
    public static void main(String[] args) {
        //Function to return remainder by dividing one number by another one - without using %
        
        int a = 51;
        int b = 16;
        int c = remainder1(a,b);
        System.out.println(c);
    }

    private static int remainder(int a, int b) {
        while(a>=b){
            a=a-b;
        }
        return a;
    }

    private static int remainder1(int a, int b) {
        int c = a / b; //will abandon the float part
        return a - c*b;
    }

}
