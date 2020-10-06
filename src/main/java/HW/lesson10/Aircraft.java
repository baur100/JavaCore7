package main.java.HW.lesson10;

public class Aircraft extends Vehicle {
    private int averageSpeed;
    private boolean militaryAircraft;
    private int distance;

    public Aircraft(String madeIn, String usage, String color, int averageSpeed, boolean militaryAircraft, int distance) {
        super(madeIn, usage, color);
        this.averageSpeed = averageSpeed;
        this.militaryAircraft = militaryAircraft;
        this.distance = distance;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public boolean isMilitaryAircraft() {
        return militaryAircraft;
    }

    public int getDistance() {
        return distance;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public void setMilitaryAircraft(boolean militaryAircraft) {
        this.militaryAircraft = militaryAircraft;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + "\naverage speed: " + this.averageSpeed +" km/h" + " \nmilitary aircraft: " + this.militaryAircraft + "\ndistance: " + this.distance+ " km";
    }
}
