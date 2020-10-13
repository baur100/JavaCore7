package lesson13a;

public class Rectangle implements Shape{
    protected int height;
    private int wide;

    public Rectangle(int height, int wide) {
        this.height = height;
        this.wide = wide;
    }
    @Override
    public void draw(){
        System.out.println("I draw a rectangle with wide = " + this.wide + " height = "+height);
    }
}
