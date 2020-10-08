package MyHomeworkQA.hw11plus;

public class Computer {

    protected int year;
    protected String serialNumber;
    protected String brand;

    private SystemBlock processor;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(int yearMade, String serialNo, String brand, SystemBlock proc, Keyboard keybd, Mouse mouse, Monitor monitor)
    {
        this.year = yearMade;
        this.serialNumber = serialNo;
        this.brand = brand;
        this.processor = proc;
        this.keyboard = keybd;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public String displayFullInfo()
    {
        return "Brand: "+brand+" | Year: "+year+" | Serial No.: "+serialNumber+"\n"
                +processor.showInfo()+"\n"+keyboard.showInfo()+"\n"
                +mouse.showInfo()+"\n"+monitor.showInfo()+"\n";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
