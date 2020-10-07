package Lesson10Homework;

public class Televisions {
    private String brand;
    private String type;
    private int price;
    private int inches;
    private String resolution;

    //Below is the *full constructor*
    public Televisions (String brand, String type, int price, int inches, String resolution)
    {
      this.brand = brand;
      this.type = type;
      this.price = price;
      this.inches = inches;
      this.resolution = resolution;
    }
    public Televisions() //Default (empty) constructor, we always need this.
    {

    }
    public void setBrand(String brand)
    {
        this.brand =brand;
    }
    public String getBrand ()
    {
        return brand;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public String getType()
    {
        return type;
    }
    public void  setPrice(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }
    public void  setInches(int inches)
    {
        this.inches = inches;
    }
    public int getInches()
    {
        return inches;
    }
    public void  setResolution(String resolution)
    {
        this.resolution = resolution;
    }
    public String getResolution()
    {
        return resolution;
    }

    public void printTelevisions() {
    System.out.println(" Brand is: "+ brand + "\n Type is: " + type + "\n TV Price is $: " + price + "\n Inches are: " + inches + "\n This Television Resolution is: " + resolution);

    }
}
