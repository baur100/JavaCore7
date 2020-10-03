package AElesson10;

public class Vehicle {
    private String model;
    private String brand;
    private String owner;
    private int year;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setYear(int year) throws Exception {
        if (year>2020 || year<1900){
            throw new Exception("Wrong Year");
        }
        this.year = year;
    }

    public void drive(){
        System.out.println("I'm "+brand+ " " + model+ " "+ year +
                " driving because I'm awesome!!!");
    }

}


