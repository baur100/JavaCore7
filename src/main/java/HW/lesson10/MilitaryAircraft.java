package main.java.HW.lesson10;

public class MilitaryAircraft extends Aircraft {
    private String typeOfWeapon;
    private int numberOfCrew;
    private boolean bombardierAircraft;

    public MilitaryAircraft(String madeIn, String usage, String color, int averageSpeed, boolean militaryAircraft, int distance, String typeOfWeapon, int numberOfCrew, boolean bombardierAircraft) {
        super(madeIn, usage, color, averageSpeed, militaryAircraft, distance);
        this.typeOfWeapon = typeOfWeapon;
        this.numberOfCrew = numberOfCrew;
        this.bombardierAircraft = bombardierAircraft;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public void setNumberOfCrew(int numberOfCrew) {
        this.numberOfCrew = numberOfCrew;
    }

    public void setBombardierAircraft(boolean bombardierAircraft) {
        this.bombardierAircraft = bombardierAircraft;
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public int getNumberOfCrew() {
        return numberOfCrew;
    }

    public boolean isBombardierAircraft() {
        return bombardierAircraft;
    }

    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + "\nnumber of crew: " + this.numberOfCrew + "\ntype of weapon: " + this.typeOfWeapon + "\nbombardier aircraft: " + this.bombardierAircraft;
    }
}
