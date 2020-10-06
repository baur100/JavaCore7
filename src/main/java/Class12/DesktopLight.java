package Class12;

public class DesktopLight implements BulbE27, AmericanElectricPlug{
    private String brand;
    private String model;
    private int price;


    public void keepingSizeAndStandard() {
        System.out.println("I use American size electical plug");
    }
    public void keepingE27Size() {
        System.out.println("I use E27 bulb size");
    }
}
