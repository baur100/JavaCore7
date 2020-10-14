package hw13;

public class DragRace {
    private int distance;
    private CarBrand car;
    private double finishSeconds;

    public DragRace(int distance, CarBrand car, double finishSeconds) {
        this.distance = distance;
        this.car = car;
        this.finishSeconds = finishSeconds;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public CarBrand getCar() {
        return car;
    }

    public void setCar(CarBrand car) {
        this.car = car;
    }

    public double getFinishSeconds() {
        return finishSeconds;
    }

    public void setFinishSeconds(double finishSeconds) {
        this.finishSeconds = finishSeconds;
    }
}
