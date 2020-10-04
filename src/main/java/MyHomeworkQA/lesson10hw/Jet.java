package MyHomeworkQA.lesson10hw;

public class Jet {

    private String model;
    private double wingspan;
    private int capacity;
    private boolean inFlight;

    public Jet(){}

    public Jet(String jetModel, double jetWingspan, int jetCapacity, boolean jetInFlight){
        this.model = jetModel;
        this.wingspan = jetWingspan;
        this.capacity = jetCapacity;
        this.inFlight = jetInFlight;
    }

    public Jet(String jetModel, boolean jetInFlight){
        this.model = jetModel;
        this.inFlight = jetInFlight;
    }

    public void displayJetInfo(){
        System.out.println("Model - "+getModel()+"\nIn Flight - "+isInFlight());
        System.out.println("------JET DATA------");
        System.out.println("Wingspan: "+getWingspan()+"\nCapacity: "+getCapacity());
        System.out.println("====================\n");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isInFlight() {
        return inFlight;
    }

    public void setInFlight(boolean inFlight) {
        this.inFlight = inFlight;
    }

}
