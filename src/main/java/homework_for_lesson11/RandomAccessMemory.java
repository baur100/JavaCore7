package homework_for_lesson11;

public class RandomAccessMemory {
    private String typeOdModule;
    private String controller;
    private int clockSpeed;

    public RandomAccessMemory(String typeOdModule, String controller, int clockSpeed) {
        this.typeOdModule = typeOdModule;
        this.controller = controller;
        this.clockSpeed = clockSpeed;
    }

    public String getTypeOdModule() {
        return typeOdModule;
    }

    public void setTypeOdModule(String typeOdModule) {
        this.typeOdModule = typeOdModule;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Override
    public String toString() {
        return "RandomAccessMemory{" +
                "typeOdModule='" + typeOdModule + '\'' +
                ", controller='" + controller + '\'' +
                ", clockSpeed=" + clockSpeed +
                '}';
    }
}
