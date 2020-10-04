package MyHomeworkQA.lesson10hw;

public class Bus {

    private String type;
    private int seats;
    private String driverName;

    public Bus(){}

    public Bus(String busType, int numOfSeats, String name){
        this.type = busType;
        this.seats = numOfSeats;
        this.driverName = name;
    }

    public Bus(String busType, String name){
        this.type = busType;
        this.driverName = name;
    }

    public String showTheBus(){
        String info = "";
        info = "This is a "+getType()+". It seats "+getSeats()+" people. It is driven by "+getDriverName()+".";
        return info;
    }

    public void emergencyExit(){
        System.out.println("Passengers, please use the emergency exit.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

}
