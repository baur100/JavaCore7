package hw12b;

public class Computer implements hdmi,usbc {
    private String type;
    private String version;

    public Computer(String type, String version) {
        this.type = type;
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public void keepstandarthdmi() {
        System.out.println("I have hdmi");

    }

    @Override
    public void keepstandartusbc() {
        System.out.println("I have usb-c");
    }
}
