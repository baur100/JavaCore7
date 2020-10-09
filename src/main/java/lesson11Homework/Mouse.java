package lesson11Homework;

public class Mouse extends BuildComputer {

    public Mouse ( String type, String brand , int cost) { //full constructor
      super(type, brand, cost);
    }

    public void printMouse(){
        System.out.println(type + brand + " mouse ." + " I cost about $" + cost);

    }
}

