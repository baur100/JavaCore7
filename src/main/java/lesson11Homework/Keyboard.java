package lesson11Homework;

public class Keyboard extends BuildComputer {

    public Keyboard ( String type, String brand , int cost) {
        super(type,brand,cost);
    }

    public void printKeyboard(){
        System.out.println(" Keyboard: " + type +  " " +brand + " costing: $"+ cost);


    }

}


