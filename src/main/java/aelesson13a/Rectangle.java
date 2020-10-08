package aelesson13a;

public class Rectangle implements Shape{
    protected int height;
    protected int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void draw(){
        System.out.println("I draw rectangle with width = " + this.width + " height= " + height);
    }
}
