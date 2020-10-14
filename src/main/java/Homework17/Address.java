package Homework17;

public class Address {

    private String streetName;
    private String city;
    private  String state;
    private  int zipcode;


    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }

    public Address(String streetName, String city, String state, int zipcode) {
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;



    }
}
