package class9;

public class Vehicle {
    public String model;
    public String brand;
    public int year;
    public String color;

    public void drive(){
        System.out.println("I'm "+brand+" "+model+" "+year+" driving because I'm awesome!!");
    }

    public void horn(){
        System.out.println(color+"car saying BEEEEP");
    }

}
