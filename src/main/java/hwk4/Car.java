package hwk4;

public class Car {

    private String color;
    private String model;
    private int year;

    public Car() {};

    public  Car (String color , String model, int year){
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel( String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void printCarInfo(){
        System.out.println("My car is: "+year+ " " + color +" " +model );
    }


}
