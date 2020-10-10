package Test1;

public class VehicleT {
    public String model;
    public String brand;
    public int year;
    public String color;
    public String name;

    public void drive(){
        System.out.println(name+" driving "+brand+" model "+model+" "+year+" year"+" because it's awesome!");
    }
    public void horn(){
        System.out.println(color+" car does Beep!");
    }
}
