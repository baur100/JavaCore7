package AElesson8;

public class App3 {
    public static void main(String[] args) {
        System.out.println(ticketPrice(70, 1000));
        System.out.println(ticketPrice1(4,100));
    }
// Function with multiple returns
    public static double ticketPrice(int age, double basePrice){
        if (age<=2){
            return 0;
        }
        if(age<12){
            return 0.5*basePrice;
        }
        if(age<=66){
            return basePrice;
        }
        return 0.8*basePrice;
    }


    public static double ticketPrice1(int age, double basePrice){
        if (age>2 && age<=12){
            return 0.5*basePrice;
        }
        if(age>12 && age<=66){
            return basePrice;
        }
        if(age>66){
            return 0.8*basePrice;
        }
        return 0;
    }
}
