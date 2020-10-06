package h11plus;

public class Computer {
    private SystemBlock systemBlock;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor[] monitors;

    public Computer(SystemBlock systemBlock, Keyboard keyboard, Mouse mouse, Monitor[] monitors) {
        this.systemBlock = systemBlock;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitors = monitors;
    }

    public SystemBlock getSystemBlock() { return systemBlock; }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor[] getMonitors() {
        return monitors;
    }
    public void printComputer(){

    }
}
