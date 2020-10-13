package Lesson11Homework;

public class Processor extends ComputerManufacture {
    protected String subType;
    protected int speed;
    public Processor (String type, String brand, int cost, String subType, int speed)

    {
       super(type, brand, cost);
       this.subType = subType;
       this.speed = speed;
    }
    public void setSubType(String subType)
    {
        this.subType = subType;
    }
    public String getSubType()
    {
        return subType;
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public int getSpeed()
    {
        return speed;
    }
    public void printProcessor()
    {
        System.out.println(brand + type + cost + "\n This computer has " + subType + " Processor type " + "\n Processor Speed is " + speed);
    }
}
