package hw11plus;

public class Keyboard {
    private String kmodel;
    private String kbrand;
    public boolean kisWireless;

    public Keyboard(String kmodel, String kbrand, boolean kisWireless) {
        this.kmodel = kmodel;
        this.kbrand = kbrand;
        this.kisWireless = kisWireless;
    }

    public Keyboard() {
    }

    public String getKmodel() {
        return kmodel;
    }

    public void setKmodel(String kmodel) {
        this.kmodel = kmodel;
    }

    public String getKbrand() {
        return kbrand;
    }

    public void setKbrand(String kbrand) {
        this.kbrand = kbrand;
    }

    public boolean isKisWireless() {
        return kisWireless;
    }

    public void setKisWireless(boolean kisWireless) {
        this.kisWireless = kisWireless;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "kmodel='" + kmodel + '\'' +
                ", kbrand='" + kbrand + '\'' +
                ", kisWireless=" + kisWireless +
                '}';
    }
}
