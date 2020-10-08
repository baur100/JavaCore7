package aehwlesson11;

import java.util.Arrays;

public class Monitors extends HardwareBrand{
    protected String[] monitorsModel;

    public Monitors(String brand, String[] monitorsModel) {
        super(brand);
        this.monitorsModel = monitorsModel;
    }

    public void setMonitorsModel(String[] monitorsModel) {
        this.monitorsModel = monitorsModel;
    }

    public String[] getMonitorsModel() {
        return monitorsModel;
    }

    @Override
    public String toString() {
        return "Monitors: " +
                "monitorsModel= " + Arrays.toString(monitorsModel) +
                ", brand= " + brand;
    }
}





