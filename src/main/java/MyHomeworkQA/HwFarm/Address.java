package MyHomeworkQA.HwFarm;

public class Address {

    private String streetAddress;
    private String town;
    private String state;
    private int zip;

    public Address(String street, String town, String state, int zipcode)
    {
        this.streetAddress = street;
        this.town = town;
        this.state = state;
        this.zip = zipcode;
    }

    @Override
    public String toString() {
        return streetAddress+", "+town+", "+state+" "+zip;
    }

}
