package lesson11Homework;

public class Keyboard extends BuildComputer {

    public Keyboard ( String type, String brand , int cost) {
        super(type,brand,cost);
    }

    public void printKeyboard(){
        System.out.println(type +brand + " Keyboard " + " and I cost about $"+ cost);


    }

}


