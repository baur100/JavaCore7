package homework_for_lesson10;

public class Box {
    private String name;
    private int length;
    private int width;

    public Box(){}

    public Box (String name, int length, int width){
        this.name = name;
        this.length = length;
        this.width = width;

    }

    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public int getLength(){return length;}
    public void setLength(int length){this.length = length;}
    public int getWidth(){return width;}
    public void setWidth(int width){this.width = width;}

    public void getInfo(){
        System.out.println("Cat box info:" + "\n"+ name + "\nlength = " +length + "\nwidth = " + width);
    }
}