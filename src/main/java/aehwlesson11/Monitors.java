package aehwlesson11;

public class Monitors extends HardwareBrand{
    protected String[] monitorsModel;

    public Monitors(String brand, String[] monitorsModel) {
        super(brand);
        this.monitorsModel = monitorsModel;
    }

    public Monitors(String brand) {
        super(brand);
    }

    public void setMonitorsModel(String[] monitorsModel) {
        this.monitorsModel = monitorsModel;
    }

    public String[] getMonitorsModel() {
        return monitorsModel;
    }
}





