package aeTechnicalInterview;

public class App1 {
    public static void main(String[] args) {
        //Change values
        int a = 15;
        int b = 17;


        //With proxy variable

        int c = a;
        a = b;
        b = c;
        System.out.println("a= "+a + "; b= " +b);

        //Without using another variable
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a= "+a + "; b= " +b);
    }
}
