package h11plus;

import java.util.ArrayList;
import java.util.List;

public class Computer {
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

    public SystemBlock getProcessor() {
        return processor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor[] getMonitors() {
        return monitors;
    }
    public String getDescription() {
        return "Our computer has:\n" +
                processor.getDescription() + "\n" +
                keyboard.getDescription() + "\n" +
                describeAllMonitors() + "\n" +
                mouse.getDescription() + "\n";
    }

    private String describeAllMonitors() {
        String result = "";
        for (int i = 0; i < monitors.length; i++){
            if (i>0 ) {
                result = result + "\n";
            }
            result = result + monitors[i].getDescription();
        }
        return result;
    }
}

