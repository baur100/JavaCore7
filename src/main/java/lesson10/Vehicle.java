package lesson10;

public class Vehicle {
    private String brand;
    private String model;
    private String owner;
    private int year;

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setYear(int year) throws Exception {
        if(year>2020 || year<1900){
            throw new Exception("Wrong year");
        }
        this.year = year;
    }
    public void drive(){
        System.out.println("I'm "+brand+ " " + model+ " "+ year +
                " driving because I'm awesome!!!");
    }
}
