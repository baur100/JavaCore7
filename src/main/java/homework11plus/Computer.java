package homework11plus;

public class Computer {
    private SystemBlock system;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(SystemBlock system, Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.system = system;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Computer(){

    }

    public SystemBlock getSystem() {
        return system;
    }

    public void setSystem(SystemBlock system) {
        this.system = system;
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

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public String pullComputerInfo (){
        return system.pullSystemBlockInfo() + keyboard.pullKeyboardInfo()
                + mouse.pullMouseInfo() + monitor.pullMonitorInfo();
    }
}
