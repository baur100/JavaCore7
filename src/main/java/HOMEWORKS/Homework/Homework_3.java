package HOMEWORKS.Homework;

            //Create function `isEven` - int takes an int as an argument and return true if it is even or false if it is odd
            //invoke it with 4 different params - print out results

public class Homework_3 {
        public static boolean isEven (int number){

        return (8%4)!=0;

    }
    public static void main(String[] args) {
            System.out.print(isEven(2) + "\n============");
            System.out.print(isEven(0) + "\n============");
            System.out.print(isEven(4));
            System.out.print(isEven(9));
    }
}
