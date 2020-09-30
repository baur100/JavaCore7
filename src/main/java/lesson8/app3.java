package lesson8;

public class app3 {
    public static void main(String[] args) {
        System.out.println(ticketPrice(50,1000));
    }
    public static double ticketPrice(int age, double basePrice){
        if (age<=2){
            return 0;
        }
        if (age<=12){
            return 0.5*basePrice;
        }
        if (age<=66){
            return basePrice;

        }
        return 0.8*basePrice;
    }
//    public static double ticketPrice1(int age, double basePrice){
//        if (age > && age<=12) {
//            return basePrice*0.5;
//        }
//        if (age>12 && age<=66){
//            return basePrice;
//                    }
//        if (age>66){
//    }
}
