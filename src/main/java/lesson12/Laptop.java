package lesson12;

public class Laptop {
    protected String screen;
    protected String processor;
    protected   String touchpad;

    public Laptop(String screen, String processor, String touchpad) {
        this.screen = screen;
        this.processor = processor;
        this.touchpad = touchpad;
    }

    public Laptop() {

    }

    public String getScreen() {
        return screen;
    }

    public String getProcessor() {
        return processor;
    }

    public String getTouchpad() {
        return touchpad;
    }

}
