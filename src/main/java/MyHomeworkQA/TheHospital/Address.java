package MyHomeworkQA.TheHospital;

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

    public String printInfo() {
        return streetAddress+", "+town+", "+state+" "+zip;
    }

    @Override
    public String toString() {
        return "Address{ " +
                "Street Address: '" + streetAddress + '\'' +
                ", Town: '" + town + '\'' +
                ", State: '" + state + '\'' +
                ", Zip: " + zip +
                " }";
    }
}
