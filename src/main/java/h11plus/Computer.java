package h11plus;

public class Computer {
    private String onecomputer;
    private String onelaptop;
    private SystemBlock processor;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor[] monitors;

    public Computer(SystemBlock processor, Keyboard keyboard, Mouse mouse, Monitor[] monitors) {
        this.processor = processor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitors = monitors;
    }

    public Computer() {
    }


    public SystemBlock getProcessor() {
        return processor;
    }

    public void setProcessor(SystemBlock processor) {
        this.processor = processor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor[] getMonitors() {
        return monitors;
    }

    public void setMonitors(Monitor[] monitors) {
        this.monitors = monitors;
    }
}
