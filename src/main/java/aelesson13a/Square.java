package aelesson13a;

public class Square extends Rectangle{

    public Square (int height){
        super (height, height);

    }

    @Override
    public void draw() {
        System.out.println("I draw a Square with height = " + height);
    }
}
