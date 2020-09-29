package L1;

public class App2 {
    public static void main(String[] args) {
//        boolean x = true;
//        boolean y = false;
//
//        boolean z = 5>6;
//        System.out.println("z = "+z);
//
//        boolean aa = 5>1;
//        System.out.println("aa = "+aa);
        // >
        // <
        // ==
        // !=
        // >=
        // <=
//        System.out.println("5>=5 "+(5>=5));
//        System.out.println("5!=5 "+(5!=5));
//        int number1 = 5;
//        int number2 = 10;
//        boolean b = number1<=number2;
//        System.out.println("b="+b);
//        int age = 20;
//
//        if (age >= 21) {
//            System.out.println("You can buy alcohol");
//        } else {
//            System.out.println("You can't buy booze");
//        }
        // if infant (age <=2) - free
        // if child (age> 2 and age<=12) - 50%
        // if adult (age>12 and age < 66) - 100%
        // if senior (age>= 66) 80%
        // Boolean operations
        // and - &&
        // or - ||
        // not - !
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false
        // 1 * 1 = 1
        // 1 * 0 = 0
        // 0 * 1 = 0
        // 0 * 0 = 0
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false
        // 1 + 1 = 1
        // 1 + 0 = 1
        // 0 + 1 = 1
        // 0 + 0 = 0
        // ! true = false
        // ! false = true
        int passengerAge = 56;
        int ticketPrice = 1000;
//        if (passengerAge <= 2) {
//            System.out.println("Free ticket");
//        }
//        if (passengerAge > 2 && passengerAge <= 12) {
//            System.out.println("Child ticket = " + ticketPrice * 0.5);
//        }
//        if (passengerAge > 12 && passengerAge < 66) {
//            System.out.println("Adult ticket = " + ticketPrice);
//        }
//        if (passengerAge >= 66) {
//            System.out.println("Senior passenger = " + ticketPrice * 0.8);
//        }

        if (passengerAge > 12) {
            if (passengerAge > 66) {
                System.out.println("Senior passenger = " + ticketPrice * 0.8);
            } else {
                System.out.println("Adult ticket = " + ticketPrice);
            }
        } else {
            if (passengerAge <= 2) {
                System.out.println("Free ticket");
            } else {
                System.out.println("Child ticket = " + ticketPrice * 0.5);
            }
        }
    }
}
