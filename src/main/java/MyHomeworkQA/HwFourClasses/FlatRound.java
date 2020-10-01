package MyHomeworkQA.HwFourClasses;

public class FlatRound {

        double radius;

        public double getDiameter(){
            return radius * 2;
        }

        public void calcArea(){
            // rounding to 2 decimal places
            double area = Math.round((3.142 * radius * radius)*100.0)/100.0;
            System.out.println("The area of the circle is: " + area);
        }

        public void calcCircumference(){
            // rounding to 2 decimal places
            double circum = Math.round((3.142 * getDiameter())*100.0)/100.0;
            System.out.println("The circumference of the circle is : " + circum);
        }

}
