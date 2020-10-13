package classwork9;

public class Vehicle {
    public String model;
    public String make;
    public int year;
    public String color;

    public void drive(){
        System.out.println("I'm "+make+" "+ model+ " "+ year+" driving just because!!!");
    }

    public void horn(){
        System.out.println(color+" car saying BEEEEP");
    }
    public void horn1(){
        System.out.println(color+" car saying BOOOOP");
    }

}
