package Lesson11Homework;
//use "extends" to create a child class.
public class Memory extends ComputerManufacture {
    protected int size;
    protected String subType;

    public Memory(String type,String brand, int cost, int size, String subType)
    //create extra variables if you like as ^^ then, create a "full constructor" of the class as ^^,
    // then use "super" to bring the "Super class/ parent class" attributes as below.
    {
        super(type, brand, cost);
        this.size = size;
        this.subType = subType;
    }// now below creates the setters and getters only for the additional variables you created.
    // If there is no other variable then only create a print method for the respective class, such as public void printPowerSupply
    public void setSubType(String subType)
    {
        this.subType = subType;
    }
    public String getSubType()
    {
        return subType;
    }
    public void setSize(int size)
    {
        this.size = size;
    }
    public int getSize()
    {
        return size;
    }
    public void printMemory()
    {
        System.out.println(type + brand + cost+ "\n The Memory size is " + size + "\n 256 GB " + subType);
    }
}
//