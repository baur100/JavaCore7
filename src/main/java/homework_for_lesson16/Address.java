package homework_for_lesson16;

public class Address {
    private String street;
    private String county;
    private String state;
    private int zipcode;

    public Address(String street, String county, String state, int zipcode) {
        this.street = street;
        this.county = county;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return street + "," + county +"," + state +"," + zipcode;
    }
}
