package homework_for_lesson11;

public class Cooler {
    private String name;
    private String filters;
    private int speed;
    private boolean isSupportPowerAdapter;

    public Cooler(String name, String filters, int speed, boolean isSupportPowerAdapter) {
        this.name = name;
        this.filters = filters;
        this.speed = speed;
        this.isSupportPowerAdapter = isSupportPowerAdapter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isSupportPowerAdapter() {
        return isSupportPowerAdapter;
    }

    public void setSupportPowerAdapter(boolean supportPowerAdapter) {
        isSupportPowerAdapter = supportPowerAdapter;
    }

    @Override
    public String toString() {
        return "Cooler{" +
                "name='" + name + '\'' +
                ", filters='" + filters + '\'' +
                ", speed=" + speed +
                ", isSupportPowerAdapter=" + isSupportPowerAdapter +
                '}';
    }
}
