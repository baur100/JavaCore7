package hw12;

public class Truck implements Engine {
    private String load;
    private int distance;


    public void start() {
        if (load == "loading") {
            return;
        }
        System.out.println("Starting engine...");
    }

    public void stop() {
        if (distance == 0) {
            System.out.println("You've arrived! Stopping engine...");
        } else {
            System.out.println("You've not reached destination! Stopping for rest!");
        }
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
