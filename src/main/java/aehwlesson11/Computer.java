package aehwlesson11;

public class Computer {
    private SystemBlock processor;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitors monitors;

    public Computer(SystemBlock processor, Keyboard keyboard, Mouse mouse, Monitors monitors) {
        this.processor = processor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitors = monitors;
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

    public Monitors getMonitors() {
        return monitors;
    }

    public void setMonitors(Monitors monitor) {
        this.monitors = monitor;
    }

    @Override
    public String toString() {
        return "Computer:" +
                "\n" + processor +
                "\n" + keyboard +
                "\n" + mouse +
                "\n" + monitors;
    }
}
