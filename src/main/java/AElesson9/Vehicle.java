package AElesson9;

public class Vehicle {
    public String model;
    public String brand;
    public int year;
    public String color;

    public void drive(){
        System.out.println("I'm "+brand+" "+model+" "+year);
    }
    public void horn (){
        System.out.println(color+" car says BEEEP");
    }
}
