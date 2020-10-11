package homework11plus;

public class Processor {
    private String brand;
    private String model;
    private double speed;

    public Processor(String brand, String model, double speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public Processor(){

    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String setModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getSpeed(){
        return speed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public String pullProcessorInfo(){
        return "Processor: " + brand + " " + model + " " + speed + "Ghz\r\n";
    }
}
