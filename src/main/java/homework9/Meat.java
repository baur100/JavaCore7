package homework9;

public class Meat {
    public String type;
    public String from;
    public double dollarPerPound;

    public void buyMeat() {
        System.out.println("Need buy some " + type + ".");
    }

    public String getMeatInto() {
        return type + " is from " + from + " for " + dollarPerPound + " per pound.";
    }
}
