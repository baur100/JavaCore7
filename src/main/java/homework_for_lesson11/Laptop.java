package homework_for_lesson11;

public class Laptop {
    private Monitor monitor;
    private Keyboard keyboard;
    private RandomAccessMemory randomAccessMemory;
    private Cooler cooler;
    private HardDrive hardDrive;

    public Laptop(Monitor monitor, Keyboard keyboard, RandomAccessMemory randomAccessMemory, Cooler cooler, HardDrive hardDrive) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.randomAccessMemory = randomAccessMemory;
        this.cooler = cooler;
        this.hardDrive = hardDrive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public RandomAccessMemory getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(RandomAccessMemory randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public Cooler getCooler() {
        return cooler;
    }

    public void setCooler(Cooler cooler) {
        this.cooler = cooler;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "monitor=" + monitor +
                ", keyboard=" + keyboard +
                ", randomAccessMemory=" + randomAccessMemory +
                ", cooler=" + cooler +
                ", hardDrive=" + hardDrive +
                '}';
    }
}
