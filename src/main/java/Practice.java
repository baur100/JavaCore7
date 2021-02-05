public class Practice {
    public static void main(String[] args) {
        int age = 12;
        boolean compare = age >=21;
        if (compare){
            System.out.println("You can drink");
        } else {
            System.out.println("You can't drink");

        }

        int passengerAge = 12;

        if (passengerAge  <=2)   {
            System.out.println("Flight is free");  }
        else

        {
            System.out.println("Passenger needs to pay");

        }


        int trainPassangerAge = 11;

        if (trainPassangerAge <= 5){
            System.out.println("it's free");
        }
        if (trainPassangerAge <=12)   {
            System.out.println("50% discount");
        }

        if(trainPassangerAge>=21)  {
            System.out.println("full price");
        }
        int taxiPassanger = 21;

        if (taxiPassanger >= 65|| taxiPassanger <=18){
            System.out.println("Enjoy your discount");
        }
            else       {
            System.out.println("Full price");
        }

    }

}