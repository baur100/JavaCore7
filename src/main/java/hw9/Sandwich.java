package hw9;

public class Sandwich {
        public String Food;
        public String bread;
        public int price2;

        public void Food(){
            System.out.println(Food+" with "+bread+" bread.");

        }

         public String getFoodInfo(){
            return Food+" "+bread+" "+price2+" dollars.";
            }
}
