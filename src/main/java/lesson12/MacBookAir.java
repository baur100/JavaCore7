package lesson12;

public class MacBookAir extends Laptop implements MacOS{
    private boolean usbPort;


    public MacBookAir(String screen, String processor, String touchpad, boolean usbPort) {
        super(screen, processor, touchpad);
        this.usbPort = usbPort;

    }

    public void setUsbPort(boolean usbPort) {
        this.usbPort = usbPort;
    }

    public void macOsCompatibleApps() {
        System.out.println("Only MacOS apps can be installed on Macbook Air");

    }
}
