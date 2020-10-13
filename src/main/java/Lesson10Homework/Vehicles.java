package Lesson10Homework;

import lesson9.Vehicle;

public class Vehicles {
    private String brand;
    private String type; //car, truck, van, bus etc.
    private String subType; //suv, sedan, 2 doors, 4 wheel, etc.
    private String model;
    private int engineSize;
    private int price;

    //create a full constructor
    public Vehicles (String brand, String type, String subType, String model, int engineSize, int price)
    {
        this.brand = brand;
        this.type = type;
        this.subType = subType;
        this.model = model;
        this.engineSize = engineSize;
        this.price = price;
    }
    public Vehicles()
    {

    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setSubType(String subType) {
        this.subType = subType;
    }
    public String getSubType()
    {
        return subType;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public String getModel()
    {
        return model;
    }
    public void setEngineSize(int engineSize)
    {
        this.engineSize =engineSize;
    }
    public int getEngineSize()
    {
        return engineSize;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }

    public void printVehicles()
    {
        System.out.println(" The brand is:" + brand + "\n The type is: " + type + "\n The subType is: " + subType + "\n The model is: " + model + "\n The Engine Size is: " + engineSize + " CC" + "\n The Price is $: " + price);
    }


}
