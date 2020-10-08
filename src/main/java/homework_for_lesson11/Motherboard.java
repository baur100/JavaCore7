package homework_for_lesson11;

public class Motherboard {
    private String socket;
    private String memory;
    private String usb;

    public Motherboard(String socket, String memory, String usb) {
        this.socket = socket;
        this.memory = memory;
        this.usb = usb;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getUsb() {
        return usb;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "socket='" + socket + '\'' +
                ", memory='" + memory + '\'' +
                ", usb='" + usb + '\'' +
                '}';
    }
}
