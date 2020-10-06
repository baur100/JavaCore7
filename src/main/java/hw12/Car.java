package hw12;

public class Car implements Engine {
    private String engine;

    public void start() {
        if (engine == "stopped") {
            System.out.println("Starting engine");
        } else {
            System.out.println("Engine already started");
        }
    }

    public void stop() {
        if (engine == "started") {
            System.out.println("Stopping engine");
        } else {
            System.out.println("Engine already stopped");
        }
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }
}
