package hw11;

public class Veterans extends Employee {

    private String veteran;
    private String vietnamera;
    private String disabled;

    public Veterans(String name, String lastName, int year, String veteran, String vietnamera, String disabled) {
        super(name,lastName,year);
        this.veteran = veteran;
        this.vietnamera = vietnamera;
        this.disabled = disabled;
    }

    public Veterans() {
    }

    public String getVeteran() {
        return veteran;
    }

    public void setVeteran(String veteran) {
        this.veteran = veteran;
    }

    public String getVietnamera() {
        return vietnamera;
    }

    public void setVietnamera(String vietnamera) {
        this.vietnamera = vietnamera;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

}
