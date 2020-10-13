package Lesson11Homework;

public class ComputerManufacture {
    protected String brand ;
    protected String type;
    protected int cost;

    public ComputerManufacture(String type, String brand, int cost)
    {
        this.brand = brand;
        this.type = type;
        this.cost = cost;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public String getBrand()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public String getType()
    {
        return brand;
    }
    public void setCost(int cost)
    {
        this.cost = cost;
    }
    public int getCost()
    {
        return cost;
    }
    public void printComputerManufacture()
    {
        System.out.println(" The brand is: " + brand + " \nThe Type is: " + type + "\n The Cost is $ " + cost);
    }
}



