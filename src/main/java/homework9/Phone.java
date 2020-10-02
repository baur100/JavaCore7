package homework9;

public class Phone {
    public String name;
    public String model;
    public double price;
    public String condition;
    public int yearofmanufacture;

    public void iphone() {
        System.out.println("This model is "+name+model+"."+"\nThe cost is $"+price+"."+ "\nThe condition is "+condition+"."+ "\nThe manufacture year is "+yearofmanufacture+".");
    }
    public void android(){
        System.out.println("\nThis model is "+name+model+"."+"\nThe cost is $"+price+"."+ "\nThe condition is "+condition+"."+ "\nThe manufacture year is "+yearofmanufacture+".");
    }
}
