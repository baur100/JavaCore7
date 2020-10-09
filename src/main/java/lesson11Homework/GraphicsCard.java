package lesson11Homework;

public class GraphicsCard extends BuildComputer {
    protected int size;

    public GraphicsCard(String type, String brand, int cost, int size) { //full constructor
        super(type, brand, cost);
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }


    public void printGraphicsCard(){
        System.out.println(type +brand + " Graphics Card " + "size is about " + size + " Gb" +  "and I cost about $" + cost);
    }
}



