package lesson12;

public class MacBookPro extends Laptop implements MacOS {
    private boolean retina;

    public MacBookPro(String screen, String processor, String touchpad, boolean retina) {
        super(screen, processor, touchpad);
        this.retina = retina;
    }

    public boolean isRetina() {
        return retina;
    }

    @Override
    public void macOsCompatibleApps() {
        System.out.println("Only MacOS apps can be installed on Macbook Pro");
    }
}
