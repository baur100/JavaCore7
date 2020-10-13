package lesson11Homework;

public class HardDrive extends BuildComputer {

    public HardDrive ( String type, String brand , int cost) { //full constructor
       super(type,brand,cost);
    }


    public void printHardDrive(){
        System.out.println(" HardDrive : " + type +brand + " " + " costing: $"+ cost);

    }

}








