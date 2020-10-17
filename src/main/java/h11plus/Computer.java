package h11plus;

import java.util.Arrays;

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

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
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

    @Override
    public String toString() {
        return "Computer{" +
                "systemBlock=" + systemBlock +
                ", keyboard=" + keyboard +
                ", mouse=" + mouse +
                ", monitors=" + Arrays.toString(monitors) +
                '}';
    }
}
